package ua.training.Model.Dao.Imp;

import ua.training.Model.Dao.*;

import java.sql.*;

public class JDBCDaoFactory extends DaoFactory {
    @Override
    public ArmorDao createArmorDao() {
        return new JDBCArmorDao(getConnection());
    }

    @Override
    public ShieldDao createShieldDao() {
        return new JDBCShieldDao(getConnection());
    }

    @Override
    public WeaponDao createWeaponDao() {
        return new JDBCWeaponDao(getConnection());
    }

    @Override
    public KnightDao createKnightDao() {
        return new JDBCKnightDao(getConnection());
    }

    private Connection getConnection() {
        try {
            return DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/EquipmentDB",
                    "root" ,
                    "Base4171Sq6Roo7" );
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
