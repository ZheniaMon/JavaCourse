package ua.training.model;

import ua.training.model.dao.DaoFactory;
import ua.training.model.dao.KnightDao;

public class Model {
    private DaoFactory daoFactory = DaoFactory.getInstance();
    private Equipment equipment = new Equipment(daoFactory);
    private KnightDao knightDao = daoFactory.createKnightDao();

    public Equipment getEquipment() {
        return equipment;
    }

    public KnightDao getKnightDao() {
        return knightDao;
    }
}
