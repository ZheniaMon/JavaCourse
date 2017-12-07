package ua.training.Model.Equipment;

import java.util.Comparator;

public class EquipmentComparator implements Comparator {
    Equipment equipment = new Equipment();

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
