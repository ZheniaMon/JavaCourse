package ua.training.Util;

import ua.training.Model.Dao.DaoFactory;
import ua.training.Model.Dao.ItemDao;
import ua.training.Model.Enity.EquipmentItem;

import java.util.ArrayList;
import java.util.List;

public class Equipment {
    private List<EquipmentItem> equipment;
    private DaoFactory daoFactory = DaoFactory.getInstance();
    private ItemDao itemDao = daoFactory.createEquipmentDao();

    public Equipment() {
        this.equipment = itemDao.findAll();
    }

    public void addEquipmentItem(EquipmentItem equipmentItem) {
        equipment.add(equipmentItem);
    }

    public void removeEquipmentItem(EquipmentItem equipmentItem) {
        equipment.remove(equipmentItem);
    }

    public int getEquipmentCost() {
        int equipmentCost = 0;
        for(EquipmentItem equipmentItem : equipment) {
            equipmentCost += equipmentItem.getItemCost();
        }

        return equipmentCost;
    }

    public void sortEquipmentByWeight() {
        equipment.sort(new EquipmentComparator());
    }

    public List<EquipmentItem> findEquipmentByCost(int minCost, int maxCost) {
        List<EquipmentItem> resultList = new ArrayList<>();
        for(EquipmentItem equipmentItem : equipment) {
            if(equipmentItem.isItemInRange(minCost,maxCost)) {
                resultList.add(equipmentItem);
            }
        }

        return resultList;
    }

    public List<EquipmentItem> getEquipment() {
        return equipment;
    }

    @Override
    public String toString() {
        return "Equipment{" +
                "equipment=" + equipment +
                '}';
    }
}
