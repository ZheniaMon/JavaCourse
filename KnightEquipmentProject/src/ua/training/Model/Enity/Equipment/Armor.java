package ua.training.Model.Enity.Equipment;

public class Armor extends EquipmentItem {
        private int armorId;
        private String armorType;

        private ProtectionType protectionType;

        public Armor() {

        }

        public Armor(String name,
                     float itemCost, double itemWeight,
                     int itemSize, int knightId, int armorId,
                     String armorType, ProtectionType protectionType) {
                super(name, itemCost, itemWeight, itemSize, knightId);
                this.armorId = armorId;
                this.armorType = armorType;
                this.protectionType = protectionType;
        }

        public int getArmorId() {
                return armorId;
        }

        public void setArmorId(int armorId) {
                this.armorId = armorId;
        }

        public String getArmorType() {
                return armorType;
        }

        public void setArmorType(String armorType) {
                this.armorType = armorType;
        }

        public ProtectionType getProtectionType() {
                return protectionType;
        }

        public void setProtectionType(ProtectionType protectionType) {
                this.protectionType = protectionType;
        }

        @Override
        public String toString() {
                return "Armor{" +
                        super.toString() +
                        "armorId=" + armorId +
                        ", armorType='" + armorType + '\'' +
                        ", protectionType=" + protectionType +
                        '}';
        }
}