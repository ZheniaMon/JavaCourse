package ua.training.model;

import ua.training.model.dao.DaoFactory;
import ua.training.model.dao.ItemDao;
import ua.training.model.enity.EquipmentItem;

import java.util.ArrayList;
import java.util.List;

public class Equipment {
    private List<EquipmentItem> equipment;
    private ItemDao itemDao;

    public Equipment(DaoFactory daoFactory) {
        this.itemDao = daoFactory.createEquipmentDao();
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
