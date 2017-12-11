package ua.training.Model.Dao;

import ua.training.Model.Dao.Imp.JDBCDaoFactory;

abstract public class DaoFactory {
    private static DaoFactory daoFactory;

    public abstract ItemDao createEquipmentDao();
    public abstract KnightDao createKnightDao();

    public static DaoFactory getInstance() {
        if(daoFactory == null) {
            synchronized (DaoFactory.class) {
                if(daoFactory == null) {
                    daoFactory = new JDBCDaoFactory();
                }
            }
        }
        return daoFactory;
    }
}
