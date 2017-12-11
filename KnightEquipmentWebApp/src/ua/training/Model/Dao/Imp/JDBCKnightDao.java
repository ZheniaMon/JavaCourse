package ua.training.Model.Dao.Imp;

import ua.training.Model.Dao.KnightDao;
import ua.training.Model.Enity.Knight;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class JDBCKnightDao implements KnightDao {

    private Connection connection;

    public JDBCKnightDao(Connection connection) {
        this.connection = connection;
    }

    @Override
    public void create(Knight entity) {
        try (PreparedStatement ps = connection.prepareStatement
                ("INSERT INTO knight (knightName, knightAge)" +
                        " VALUES (? ,? )")){
            ps.setString(1 , entity.getKnightName());
            ps.setInt(2 ,entity.getKnightAge());
            ps.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void update(Knight entity) {
        try (PreparedStatement ps = connection.prepareStatement(
                "UPDATE knight SET knightName = ? , knightAge = ?  " +
                        "WHERE id = ?")){
            ps.setString(1 , entity.getKnightName());
            ps.setInt(2 ,entity.getKnightAge());
            ps.setInt(3, entity.getKnightId());
            ps.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void delete(int id) {
        try (PreparedStatement ps = connection.prepareStatement(
                "DELETE FROM knight WHERE id = ?")){
            ps.setInt(1, id);
            ps.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public Knight findById(int id) {
        try (PreparedStatement ps = connection.prepareStatement
                ("SELECT * FROM knight WHERE id = ?")){
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
        return result;
    }

    @Override
    public List<Knight> findAll() {
        List<Knight> resultList = new ArrayList<>();
        try (Statement ps = connection.createStatement()){
            ResultSet rs = ps.executeQuery("SELECT * " +
                    "FROM knight");

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
