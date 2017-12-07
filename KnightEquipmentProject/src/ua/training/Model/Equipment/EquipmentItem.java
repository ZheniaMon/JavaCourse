package ua.training.Model.Equipment;

abstract public class EquipmentItem {
    private float itemCost;
    private double itemWeight;

    public EquipmentItem(float itemCost, double itemWeight) {
        this.itemCost = itemCost;
        this.itemWeight = itemWeight;
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

    public boolean isItemInRange(int minCost, int maxCost) {
        return (getItemCost() > minCost & getItemCost() < maxCost);
    }

    @Override
    public String toString() {
        return "EquipmentItem[ " +
                "itemCost = " +
                itemCost +
                ", itemWeight = " +
                itemWeight + " ]";
    }
}
