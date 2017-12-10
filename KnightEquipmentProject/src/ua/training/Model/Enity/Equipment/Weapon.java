package ua.training.Model.Enity.Equipment;

public class Weapon extends EquipmentItem {
    private int weaponId;
    private String weaponType;

    public Weapon() {

    }

    public Weapon(String name,
                  float itemCost, double itemWeight,
                  int itemSize, int knightId, int weaponId, String weaponType) {
        super(name, itemCost, itemWeight, itemSize, knightId);
        this.weaponId = weaponId;
        this.weaponType = weaponType;
    }

    public int getWeaponId() {
        return weaponId;
    }

    public void setWeaponId(int weaponId) {
        this.weaponId = weaponId;
    }

    public String getWeaponType() {
        return weaponType;
    }

    public void setWeaponType(String weaponType) {
        this.weaponType = weaponType;
    }

    @Override
    public String toString() {
        return "Weapon{" +
                super.toString() +
                "weaponId=" + weaponId +
                ", weaponType='" + weaponType + '\'' +
                '}';
    }
}
