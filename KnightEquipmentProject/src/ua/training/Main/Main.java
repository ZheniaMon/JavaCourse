package ua.training.Main;

import ua.training.Model.Dao.DaoFactory;
import ua.training.Model.Dao.WeaponDao;

public class Main {
    public static void main(String[] args) {
        DaoFactory daoFactory = DaoFactory.getInstance();
        WeaponDao weaponDao = daoFactory.createWeaponDao();


    }
}

