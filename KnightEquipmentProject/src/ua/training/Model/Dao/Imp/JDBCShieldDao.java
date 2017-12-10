package ua.training.Model.Dao.Imp;

import ua.training.Model.Dao.ShieldDao;
import ua.training.Model.Enity.Equipment.Shield;

import java.sql.*;
import java.util.*;

public class JDBCShieldDao implements ShieldDao {
    private Connection connection;

    public JDBCShieldDao(Connection connection) {
        this.connection = connection;
    }

    @Override
    public void create(Shield entity) {
        try (PreparedStatement ps = connection.prepareStatement
                ("INSERT INTO shield (shieldForm, shieldProtection" +
                        "shieldName, shieldCost, shieldWeight," +
                        "shieldSize, knightId)" +
                        " VALUES (?, ?, ?, ?, ?, ?, ?)")){
            ps.setString(1, entity.getShieldForm());
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
    public void update(Shield entity) {
        try (PreparedStatement ps = connection.prepareStatement
                ("UPDATE shield SET shieldForm = ?," +
                        "shieldProtection = ?, shieldName = ?," +
                        "shieldCost = ?, shieldWeight = ?," +
                        "shieldSize = ?, knightId = ?" +
                        "WHERE id = ?")){
            ps.setString(1, entity.getShieldForm());
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
                "DELETE FROM shield WHERE id = ?")){
            ps.setInt(1, id);
            ps.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public Shield findById(int id) {
        try (PreparedStatement ps = connection.prepareStatement
                ("SELECT * FROM shield WHERE id = ?")){
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

    private Shield extractFromResultSet(ResultSet resultSet)
            throws SQLException {
        Shield weapon = new Shield();

        weapon.setShieldId(resultSet.getInt("armorId"));
        weapon.setShieldForm(resultSet.getString("armorType"));
        weapon.setItemName(resultSet.getString("armorName"));
        weapon.setItemCost(resultSet.getFloat("armorCost"));
        weapon.setItemWeight(resultSet.getDouble("armorWeight"));
        weapon.setItemSize(resultSet.getInt("armorSize"));
        weapon.setKnightId(resultSet.getInt("knightId"));
        return weapon;
    }

    @Override
    public List<Shield> findAll() {
        List<Shield> resultList = new ArrayList<>();
        try (Statement ps = connection.createStatement()){
            ResultSet rs = ps.executeQuery("SELECT * " +
                    "FROM shield");

            while ( rs.next() ){
                Shield result = extractFromResultSet(rs);
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
