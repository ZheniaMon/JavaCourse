package ua.training.Model.Equipment;

import ua.training.Model.EquipmentTypes.WeaponType;

public class Weapon extends EquipmentItem {
    private String name;
    private int length;
    private WeaponType weaponType;

    public Weapon(float itemCost, double itemWeight, String name, int length, WeaponType weaponType) {
        super(itemCost, itemWeight);
        this.name = name;
        this.length = length;
        this.weaponType = weaponType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public WeaponType getWeaponType() {
        return weaponType;
    }

    public void setWeaponType(WeaponType weaponType) {
        this.weaponType = weaponType;
    }

    @Override
    public String toString() {
        return "Weapon[" +
                "name='" + name + '\'' +
                ", length=" + length +
                ", weaponType=" + weaponType +
                super.toString() +
                "]";
    }
}
