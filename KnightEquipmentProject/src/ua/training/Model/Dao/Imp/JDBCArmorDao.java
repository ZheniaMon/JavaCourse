package ua.training.Model.Dao.Imp;

import ua.training.Model.Dao.ArmorDao;
import ua.training.Model.Enity.Equipment.Armor;

import java.sql.*;
import java.util.*;

public class JDBCArmorDao implements ArmorDao {
    private Connection connection;

    public JDBCArmorDao(Connection connection) {
        this.connection = connection;
    }

    @Override
    public void create(Armor entity) {
        try (PreparedStatement ps = connection.prepareStatement
                ("INSERT INTO armor (armorType, armorProtection" +
                        "armorName, armorCost, armorWeight," +
                        "armorSize, knightId)" +
                        " VALUES (?, ?, ?, ?, ?, ?, ?)")){
            ps.setString(1, entity.getArmorType());
            ps.setInt(2, entity.getProtectionType().getProtectionTypeId());
            ps.setString(3, entity.getItemName());
            ps.setFloat(4, entity.getItemCost());
            ps.setDouble(5, entity.getItemWeight());
            ps.setInt(6, entity.getItemSize());
            ps.setInt(7, entity.getKnightId());
            ps.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void update(Armor entity) {
        try (PreparedStatement ps = connection.prepareStatement
                ("UPDATE armor SET armorType = ?," +
                        "armorProtection = ?, armorName = ?," +
                        "armorCost = ?, armorWeight = ?," +
                        "armorSize = ?, knightId = ?" +
                        "WHERE id = ?")){
            ps.setString(1, entity.getArmorType());
            ps.setInt(2, entity.getProtectionType().getProtectionTypeId());
            ps.setString(3, entity.getItemName());
            ps.setFloat(4, entity.getItemCost());
            ps.setDouble(5, entity.getItemWeight());
            ps.setInt(6, entity.getItemSize());
            ps.setInt(7, entity.getKnightId());
            ps.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void delete(int id) {
        try (PreparedStatement ps = connection.prepareStatement(
                "DELETE FROM armor WHERE id = ?")){
            ps.setInt(1, id);
            ps.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public Armor findById(int id) {
        try (PreparedStatement ps = connection.prepareStatement
                ("SELECT * FROM armor WHERE id = ?")){
            ps.setInt(1,id);
            ResultSet rs = ps.executeQuery();
            if( rs.next() ){
                return extractFromResultSet(rs);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return null;
    }

    private Armor extractFromResultSet(ResultSet resultSet)
            throws SQLException {
        Armor weapon = new Armor();

        weapon.setArmorId(resultSet.getInt("armorId"));
        weapon.setArmorType(resultSet.getString("armorType"));
        weapon.setItemName(resultSet.getString("armorName"));
        weapon.setItemCost(resultSet.getFloat("armorCost"));
        weapon.setItemWeight(resultSet.getDouble("armorWeight"));
        weapon.setItemSize(resultSet.getInt("armorSize"));
        weapon.setKnightId(resultSet.getInt("knightId"));
        return weapon;
    }

    @Override
    public List<Armor> findAll() {
        List<Armor> resultList = new ArrayList<>();
        try (Statement ps = connection.createStatement()){
            ResultSet rs = ps.executeQuery("SELECT * " +
                    "FROM armor");

            while ( rs.next() ){
                Armor result = extractFromResultSet(rs);
                resultList.add(result);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return resultList;
    }

    @Override
    public void close() throws Exception {
        try {
            connection.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
