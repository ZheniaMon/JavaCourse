package ua.training.model.enity;

/**
 * класс элемента экипировки,
 * содержит свойства
 *  <b>код эелемента</b>
 *  <b>название</b>
 *  <b>стоимость</b>
 *  <b>вес</b>
 *  <b>размер</b>
 *  <b>код рыцаря</b>
 *  <b>тип</b>
 */

public class EquipmentItem {
    private int itemId;
    private String itemName;
    private float itemCost;
    private double itemWeight;
    private int itemSize;
    private int knightId;
    private String itemType;

    public EquipmentItem() {
    }

    public EquipmentItem(int itemId, String name, float itemCost,
                         double itemWeight, int itemSize,
                         int knightId, String itemType) {
        this.itemId = itemId;
        this.itemName = name;
        this.itemCost = itemCost;
        this.itemWeight = itemWeight;
        this.itemSize = itemSize;
        this.knightId = knightId;
        this.itemType = itemType;
    }

    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public float getItemCost() {
        return itemCost;
    }

    public void setItemCost(float itemCost) {
        this.itemCost = itemCost;
    }

    public double getItemWeight() {
        return itemWeight;
    }

    public void setItemWeight(double itemWeight) {
        this.itemWeight = itemWeight;
    }

    public String getName() {
        return itemName;
    }

    public void setName(String name) {
        this.itemName = name;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public int getItemSize() {
        return itemSize;
    }

    public void setItemSize(int itemSize) {
        this.itemSize = itemSize;
    }

    public boolean isItemInRange(int minCost, int maxCost) {
        return (getItemCost() > minCost & getItemCost() < maxCost);
    }

    public int getKnightId() {
        return knightId;
    }

    public void setKnightId(int knightId) {
        this.knightId = knightId;
    }

    public String getItemType() {
        return itemType;
    }

    public void setItemType(String itemType) {
        this.itemType = itemType;
    }

    @Override
    public String toString() {
        return "EquipmentItem{" +
                " Id=" + itemId +
                ", Name='" + itemName + '\'' +
                ", Cost=" + itemCost +
                ", Weight=" + itemWeight +
                ", Size=" + itemSize +
                ", Id=" + knightId +
                ", Type='" + itemType + '\'' +
                '}' + "\n";
    }
}
