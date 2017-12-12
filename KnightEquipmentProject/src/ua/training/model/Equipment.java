package ua.training.model;

import ua.training.model.enity.EquipmentItem;

import java.util.ArrayList;
import java.util.List;

/**
 * Класс содержит методы для работы с экипировкой
 */

public class Equipment {
    private List<EquipmentItem> equipment;

    public Equipment(List<EquipmentItem> equipment) {
        this.equipment = equipment;
    }

    public Equipment() {
    }

    /**
     * добавление элемента
     * @param equipmentItem элемент для добавления
     */
    public void addEquipmentItem(EquipmentItem equipmentItem) {
        equipment.add(equipmentItem);
    }

    /**
     * удаление эелемента
     * @param equipmentItem элемент для удаления
     */
    public void removeEquipmentItem(EquipmentItem equipmentItem) {
        equipment.remove(equipmentItem);
    }

    /**
     * метод получение стоимости
     * @return возвращает общую стоимость всех элементов экипировки
     */
    public int getEquipmentCost() {
        int equipmentCost = 0;
        for(EquipmentItem equipmentItem : equipment) {
            equipmentCost += equipmentItem.getItemCost();
        }

        return equipmentCost;
    }

    /**
     * метод сортирует экипировку по весу
     */
    public void sortEquipmentByWeight() {
        equipment.sort(new EquipmentComparator());
    }

    /**
     * метод находит все элементы чья цена попадает в диапазон
     * @param minCost минимальная цена
     * @param maxCost максимальная цена
     * @return список найденных эелементов
     */
    public List<EquipmentItem> findEquipmentByCost(int minCost, int maxCost) {
        List<EquipmentItem> resultList = new ArrayList<>();
        for(EquipmentItem equipmentItem : equipment) {
            if(equipmentItem.isItemInRange(minCost,maxCost)) {
                resultList.add(equipmentItem);
            }
        }

        return resultList;
    }

    public void setEquipment(List<EquipmentItem> equipment) {
        this.equipment = equipment;
    }

    public List<EquipmentItem> getEquipment() {
        return equipment;
    }

    @Override
    public String toString() {
        return equipment + "\n";
    }
}
