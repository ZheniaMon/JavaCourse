package ua.training.Model.Dao.Imp;

import com.sun.org.apache.bcel.internal.generic.Select;
import ua.training.Model.Dao.WeaponDao;
import ua.training.Model.Enity.Equipment.Weapon;

import java.sql.*;
import java.util.*;

public class JDBCWeaponDao implements WeaponDao {
    private Connection connection;

    public JDBCWeaponDao(Connection connection) {
        this.connection = connection;
    }

    @Override
    public void create(Weapon entity) {
        try (PreparedStatement ps = connection.prepareStatement
                ("INSERT INTO weapon (weaponType," +
                        "weaponName, weaponCost, weaponWeight," +
                        "weaponSize, knightId)" +
                        " VALUES (?, ?, ?, ?, ?, ?)")){
            ps.setString(1, entity.getWeaponType());
            ps.setString(2, entity.getItemName());
            ps.setFloat(3, entity.getItemCost());
            ps.setDouble(4, entity.getItemWeight());
            ps.setInt(5, entity.getItemSize());
            ps.setInt(6, entity.getKnightId());
            ps.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void update(Weapon entity) {
        try (PreparedStatement ps = connection.prepareStatement(
                "UPDATE weapon SET weaponType = ?, weaponName = ?," +
                        "weaponCost = ?, weaponWeight = ?," +
                        "weaponSize = ?, knightId = ?" +
                        "WHERE id = ?")){
            ps.setString(1, entity.getWeaponType());
            ps.setString(2, entity.getItemName());
            ps.setFloat(3, entity.getItemCost());
            ps.setDouble(4, entity.getItemWeight());
            ps.setInt(5, entity.getItemSize());
            ps.setInt(6, entity.getKnightId());
            ps.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void delete(int id) {
        try (PreparedStatement ps = connection.prepareStatement(
                "DELETE FROM weapon WHERE id = ?")){
            ps.setInt(1, id);
            ps.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public Weapon findById(int id) {
        try (PreparedStatement ps = connection.prepareStatement
                ("SELECT * FROM weapon WHERE id = ?")){
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

    private Weapon extractFromResultSet(ResultSet resultSet)
            throws SQLException {
        Weapon weapon = new Weapon();

        weapon.setWeaponId(resultSet.getInt("weaponId"));
        weapon.setWeaponType(resultSet.getString("weaponType"));
        weapon.setItemName(resultSet.getString("weaponName"));
        weapon.setItemCost(resultSet.getFloat("weaponCost"));
        weapon.setItemWeight(resultSet.getDouble("weaponWeight"));
        weapon.setItemSize(resultSet.getInt("weaponSize"));
        weapon.setKnightId(resultSet.getInt("knightId"));
        return weapon;
    }

    @Override
    public List<Weapon> findAll() {
        List<Weapon> resultList = new ArrayList<>();
        try (Statement ps = connection.createStatement()){
            ResultSet rs = ps.executeQuery("SELECT * " +
                    "FROM weapon");

            while ( rs.next() ){
                Weapon result = extractFromResultSet(rs);
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
