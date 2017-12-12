package ua.training.model.dao.imp;

import ua.training.model.dao.KnightDao;
import ua.training.model.enity.Knight;
import static ua.training.model.constants.DaoConstants.*;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * класс для работы с таблицей рыцарей
 */

public class JDBCKnightDao implements KnightDao {

    private Connection connection;

    public JDBCKnightDao(Connection connection) {
        this.connection = connection;
    }

    /**
     * метод создает запись в таблице
     * @param entity запись которю нужно создать
     */
    @Override
    public void create(Knight entity) {
        try (PreparedStatement ps = connection.prepareStatement
                (CREATE_KNIGHT)){
            ps.setString(1 , entity.getKnightName());
            ps.setInt(2 ,entity.getKnightAge());
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
    public void update(Knight entity) {
        try (PreparedStatement ps = connection.prepareStatement(
                UPDATE_KNIGHT)){
            ps.setString(1 , entity.getKnightName());
            ps.setInt(2 ,entity.getKnightAge());
            ps.setInt(3, entity.getKnightId());
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
                DELETE_KNIGHT)){
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
    public Knight findById(int id) {
        try (PreparedStatement ps = connection.prepareStatement
                (FIND_KNIGHT_BY_ID)){
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

    private Knight extractFromResultSet(ResultSet rs)
            throws SQLException {
        Knight result = new Knight();
        result.setKnightId(rs.getInt("knightId") );
        result.setKnightName(rs.getString("knightName"));
        result.setKnightAge(rs.getInt("knightAge"));
        result.setEquipment(new JDBCItemDao(connection).findAllByKnightId(rs.getInt("knightId")));
        return result;
    }

    /**
     * метод находит все записи таблицы
     * @return список записей
     */
    @Override
    public List<Knight> findAll() {
        List<Knight> resultList = new ArrayList<>();
        try (Statement ps = connection.createStatement()){
            ResultSet rs = ps.executeQuery(FIND_ALL_KNIGHTS);

            while ( rs.next() ){
                Knight result = extractFromResultSet(rs);
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
