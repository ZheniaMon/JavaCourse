package ua.training.Model.Equipment;

import java.util.*;

public class Equipment {
    private List<EquipmentItem> equipment = new ArrayList<>();

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

    public void setEquipment(List<EquipmentItem> equipment) {
        this.equipment = equipment;
    }
}
