package ua.training.Model.Enity.Equipment;

public class Shield extends EquipmentItem {
    private int shieldId;
    private String shieldForm;

    private ProtectionType protectionType;

    public Shield() {
    }

    public Shield(String name,
                  float itemCost, double itemWeight, int knightId,
                  int itemSize, int shieldId,
                  String shieldForm, ProtectionType protectionType) {
        super(name, itemCost, itemWeight, itemSize, knightId);
        this.shieldId = shieldId;
        this.shieldForm = shieldForm;
        this.protectionType = protectionType;
    }

    public int getShieldId() {
        return shieldId;
    }

    public void setShieldId(int shieldId) {
        this.shieldId = shieldId;
    }

    public String getShieldForm() {
        return shieldForm;
    }

    public void setShieldForm(String shieldForm) {
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
        return "Shield{" +
                super.toString() +
                "shieldId=" + shieldId +
                ", shieldForm='" + shieldForm + '\'' +
                ", protectionType=" + protectionType +
                '}';
    }
}
