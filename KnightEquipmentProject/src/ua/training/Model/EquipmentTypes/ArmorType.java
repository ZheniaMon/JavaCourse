package ua.training.Model.EquipmentTypes;

public enum ArmorType {
    SCALY(300, ProtectionType.MEAN),
    HAUBERK(400, ProtectionType.MEAN),
    PLATY(500, ProtectionType.STRONG);

    private final int cost;
    private  final ProtectionType protectionType;

    ArmorType(int cost, ProtectionType protectionType) {
        this.cost = cost;
        this.protectionType = protectionType;
    }

    public int getCost() {
        return cost;
    }

    public ProtectionType getProtectionType() {
        return protectionType;
    }
}
