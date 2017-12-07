package ua.training.Model.Equipment;

import ua.training.Model.EquipmentTypes.ArmorType;

public class Armor extends EquipmentItem {
        private int armorSize;
        private ArmorType armorType;

        public Armor(float itemCost, double itemWeight, int armorSize, ArmorType armorType) {
                super(itemCost + armorType.getCost(), itemWeight);
                this.armorSize = armorSize;
                this.armorType = armorType;
        }

        public int getArmorSize() {
                return armorSize;
        }

        public void setArmorSize(int size) {
                this.armorSize = size;
        }

        public ArmorType getArmorType() {
                return armorType;
        }

        public void setArmorType(ArmorType armorType) {
                this.armorType = armorType;
        }

        @Override
        public String toString() {
                return "Armor[ " +
                        "armorSize = " + getArmorSize() +
                        ", armorType = " + getArmorType() +
                        super.toString() +
                        " ]";
        }
}
