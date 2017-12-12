package ua.training.model;

import ua.training.model.enity.EquipmentItem;

import java.util.Comparator;

/**
 * класс содержащий методы сравнения элементов
 */

public class EquipmentComparator implements Comparator {

    /**
     * метод сравнивает два элемента экипировки по их весу
     * @param o первый элемент
     * @param t1 второй элемент
     * @return 1 - если первый больше второго, -1 если меньше, 0 если равны
     */
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
