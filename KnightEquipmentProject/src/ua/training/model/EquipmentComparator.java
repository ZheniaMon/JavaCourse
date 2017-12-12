package ua.training.model;

import ua.training.model.enity.EquipmentItem;

import java.util.Comparator;

public class EquipmentComparator implements Comparator {

    @Override
    public int compare(Object o, Object t1) {
        EquipmentItem equipmentItemOne = (EquipmentItem) o;
        EquipmentItem equipmentItemTwo = (EquipmentItem) t1;

        if(equipmentItemOne.getItemWeight() > equipmentItemTwo.getItemWeight()) {
            return 1;
        } else if(equipmentItemOne.getItemWeight() < equipmentItemTwo.getItemWeight()) {
            return -1;
        }

        return 0;
    }
}
