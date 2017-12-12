package ua.training.model;

import ua.training.model.dao.DaoFactory;
import ua.training.model.dao.ItemDao;
import ua.training.model.dao.KnightDao;
import ua.training.model.enity.EquipmentItem;
import ua.training.model.enity.Knight;

import java.util.List;

/**
 * общий класс модели использующий другие классы для выполнения функций
 */
public class Model {
    private DaoFactory daoFactory;
    private ItemDao itemDao;
    private Equipment equipment;
    private KnightUtil knightUtil;

    public Model() {
        daoFactory = DaoFactory.getInstance();
        itemDao = daoFactory.createEquipmentDao();
        this.knightUtil = new KnightUtil(daoFactory);
    }

    public List<Knight> getAllKnights() {
        return knightUtil.getAllKnights();
    }

    public Knight findKnightById(int id) {
        return knightUtil.findKnightById(id);
    }

    public float getEquipmentCost() {
        return equipment.getEquipmentCost();
    }

    public void sortEquipment() {
        equipment.sortEquipmentByWeight();
    }

    public List<EquipmentItem> getItemsInRange(int min, int max) {
        return equipment.findEquipmentByCost(min, max);
    }

    public void setEquipment(Equipment equipment) {
        this.equipment = equipment;
    }

    public Equipment getEquipment() {
        return equipment;
    }

    public KnightUtil getKnightUtil() {
        return knightUtil;
    }

    public void setKnightUtil(KnightUtil knightUtil) {
        this.knightUtil = knightUtil;
    }

    public ItemDao getItemDao() {
        return itemDao;
    }

}
