package ua.training.Model.Dao.Imp;

import ua.training.Model.Dao.ItemDao;
import ua.training.Model.Enity.EquipmentItem;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class JDBCItemDao implements ItemDao {
    private Connection connection;

    public JDBCItemDao(Connection connection) {
        this.connection = connection;
    }

    @Override
    public void create(EquipmentItem entity) {
        try (PreparedStatement ps = connection.prepareStatement
                ("INSERT INTO equipmentitem (itemType, itemName," +
                        " itemCost, itemWeight," +
                        " itemSize, knightId)" +
                        " VALUES (? ,?, ?, ?, ?, ?)")){
            ps.setString(1 , entity.getItemType());
            ps.setString(2 ,entity.getItemName());
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
    public void update(EquipmentItem entity) {
        try (PreparedStatement ps = connection.prepareStatement(
                "UPDATE equipmentitem SET itemType = ? ," +
                        " itemName = ?, itemCost = ?," +
                        "itemWeight = ?, itemSize = ?," +
                        "knightId = ? " +
                        "WHERE id = ?")){
            ps.setString(1 , entity.getItemType());
            ps.setString(2 ,entity.getItemName());
            ps.setFloat(3, entity.getItemCost());
            ps.setDouble(4, entity.getItemWeight());
            ps.setInt(5, entity.getItemSize());
            ps.setInt(6, entity.getKnightId());
            ps.setInt(7, entity.getItemId());
            ps.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void delete(int id) {
        try (PreparedStatement ps = connection.prepareStatement(
                "DELETE FROM equipmentitem WHERE id = ?")){
            ps.setInt(1, id);
            ps.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public EquipmentItem findById(int id) {
        try (PreparedStatement ps = connection.prepareStatement
                ("SELECT * FROM equipmentitem WHERE id = ?")){
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

    private EquipmentItem extractFromResultSet(ResultSet rs)
            throws SQLException {
        EquipmentItem result = new EquipmentItem();
        result.setItemId(rs.getInt("itemId"));
        result.setItemType(rs.getString("itemType"));
        result.setItemName(rs.getString("itemName"));
        result.setItemCost(rs.getFloat("itemCost"));
        result.setItemWeight(rs.getDouble("itemWeight"));
        result.setItemSize(rs.getInt("itemSize"));
        result.setKnightId(rs.getInt("knightId"));
        return result;
    }

    @Override
    public List<EquipmentItem> findAll() {
        List<EquipmentItem> resultList = new ArrayList<>();
        try (Statement ps = connection.createStatement()){
            ResultSet rs = ps.executeQuery("SELECT * " +
                    "FROM equipmentitem");

            while ( rs.next() ){
                EquipmentItem result = extractFromResultSet(rs);
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
