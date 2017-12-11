package ua.training.Model.Dao.Imp;

import ua.training.Model.Dao.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCDaoFactory extends DaoFactory {

    @Override
    public ItemDao createEquipmentDao() {
        return new JDBCItemDao(getConnection());
    }

    @Override
    public KnightDao createKnightDao() {
        return new JDBCKnightDao(getConnection());
    }

    private Connection getConnection() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            return DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/EquipmentDB?autoReconnect=true&useSSL=false",
                    "root" ,
                    "Base4171Sq6Roo7" );
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException c) {
            throw new RuntimeException(c);
        }
    }
}
