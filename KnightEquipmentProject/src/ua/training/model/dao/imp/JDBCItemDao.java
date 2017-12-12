package ua.training.model.dao.imp;

import ua.training.model.dao.*;
import ua.training.model.enity.EquipmentItem;
import static ua.training.model.constants.DaoConstants.*;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * класс для работы с таблицей элементов экипировки
 */
public class JDBCItemDao implements ItemDao {
    private Connection connection;

    public JDBCItemDao(Connection connection) {
        this.connection = connection;
    }

    /**
     * метод создает запись в таблице
     * @param entity запись которю нужно создать
     */
    @Override
    public void create(EquipmentItem entity) {
        try (PreparedStatement ps = connection.prepareStatement
                (CREATE_ITEM)){
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

    /**
     * метод изменения записи в табл
     * @param entity новая запись
     */
    @Override
    public void update(EquipmentItem entity) {
        try (PreparedStatement ps = connection.prepareStatement(
                UPDATE_ITEM)){
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

    /**
     * метод удаления записи по ид
     * @param id ид записи
     */
    @Override
    public void delete(int id) {
        try (PreparedStatement ps = connection.prepareStatement(
                DELETE_ITEM)){
            ps.setInt(1, id);
            ps.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * метод находить запись по ид
     * @param id ид записи
     * @return найденную запись
     */
    @Override
    public EquipmentItem findById(int id) {
        try (PreparedStatement ps = connection.prepareStatement
                (FIND_ITEM_BY_ID)){
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

    /**
     * метод находит все записи таблицы
     * @return список записей
     */
    @Override
    public List<EquipmentItem> findAll() {
        List<EquipmentItem> resultList = new ArrayList<>();
        try (Statement ps = connection.createStatement()){
            ResultSet rs = ps.executeQuery(FIND_ALL_ITEMS);
            while ( rs.next() ){
                EquipmentItem result = extractFromResultSet(rs);
                resultList.add(result);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return resultList;
    }

    /**
     * метод находит все записи таблицы по ид рыцаря
     * @param id ид рыцаря
     * @return список записей
     */
    @Override
    public List<EquipmentItem> findAllByKnightId(int id) {
        List<EquipmentItem> resultList = new ArrayList<>();
        try (PreparedStatement ps = connection.prepareStatement(FIND_ALL_ITEMS_BY_KNIGHT_ID)){
            ps.setInt(1,id);
            ResultSet rs = ps.executeQuery();
            while ( rs.next() ){
                EquipmentItem result = extractFromResultSet(rs);
                resultList.add(result);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (NullPointerException e) {
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
