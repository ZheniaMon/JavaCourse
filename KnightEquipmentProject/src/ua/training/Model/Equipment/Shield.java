package ua.training.Model.Equipment;

import ua.training.Model.EquipmentTypes.ProtectionType;
import ua.training.Model.EquipmentTypes.ShieldForm;

public class Shield extends EquipmentItem {
    private int shieldSize;
    private ShieldForm shieldForm;
    private ProtectionType protectionType;

    public Shield(float itemCost, double itemWeight, int shieldSize, ShieldForm shieldForm, ProtectionType protectionType) {
        super(itemCost, itemWeight);
        this.shieldSize = shieldSize;
        this.shieldForm = shieldForm;
        this.protectionType = protectionType;
    }

    public int getShieldSize() {
        return shieldSize;
    }

    public void setShieldSize(int size) {
        this.shieldSize = shieldSize;
    }

    public ShieldForm getShieldForm() {
        return shieldForm;
    }

    public void setShieldForm(ShieldForm shieldForm) {
        this.shieldForm = shieldForm;
    }

    public ProtectionType getProtectionType() {
        return protectionType;
    }

    public void setProtectionType(ProtectionType protectionType) {
        this.protectionType = protectionType;
    }

    @Override
    public String toString() {
        return "Shield[" +
                "shieldSize=" + shieldSize +
                ", shieldForm=" + shieldForm +
                ", protectionType=" + protectionType +
                super.toString() +
                ']';
    }
}
