package ua.training.Model.Dao;

abstract public class DaoFactory {
    private static DaoFactory daoFactory;

    public abstract ArmorDao createArmorDao();
    public abstract ShieldDao createShieldDao();
    public abstract WeaponDao createWeaponDao();
    public abstract KnightDao createKnightDao();

    public static DaoFactory getInstance() {
        if(daoFactory == null) {
            synchronized (DaoFactory.class) {
                if(daoFactory == null) {

                }
            }
        }
        return daoFactory;
    }
}
