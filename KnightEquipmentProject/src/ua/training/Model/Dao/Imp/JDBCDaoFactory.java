package ua.training.model.dao.imp;

import ua.training.model.dao.*;
import static ua.training.model.constants.DaoConstants.*;

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
            //Class.forName("com.mysql.jdbc.Driver");
            return DriverManager.getConnection(
                    CONNECTION_STRING,
                    USER ,
                    PASSWORD );
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } /*catch (ClassNotFoundException c) {
            throw new RuntimeException(c);
        }*/
    }
}
