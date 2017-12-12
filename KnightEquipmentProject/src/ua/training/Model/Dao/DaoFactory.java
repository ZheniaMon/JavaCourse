package ua.training.model.dao;

import ua.training.model.dao.imp.JDBCDaoFactory;

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
