package ua.training.Model.Enity.Equipment;

abstract public class EquipmentItem {
    private String itemName;
    private float itemCost;
    private double itemWeight;
    private int itemSize;
    private int knightId;

    public EquipmentItem() {
    }

    public EquipmentItem(String name, float itemCost,
                         double itemWeight, int itemSize,
                         int knightId) {
        this.itemName = name;
        this.itemCost = itemCost;
        this.itemWeight = itemWeight;
        this.itemSize = itemSize;
        this.knightId = knightId;
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

    @Override
    public String toString() {
        return "EquipmentItem{" +
                ", itemName='" + itemName + '\'' +
                ", itemCost=" + itemCost +
                ", itemWeight=" + itemWeight +
                ", itemSize=" + itemSize +
                '}';
    }
}
