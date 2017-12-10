package ua.training.Model.Enity.Equipment;

public class ProtectionType {
    private int protectionTypeId;
    private String protectionTypeName;

    public ProtectionType(int protectionTypeId, String protectionTypeName) {
        this.protectionTypeId = protectionTypeId;
        this.protectionTypeName = protectionTypeName;
    }

    public int getProtectionTypeId() {
        return protectionTypeId;
    }

    public void setProtectionTypeId(int protectionTypeId) {
        this.protectionTypeId = protectionTypeId;
    }

    public String getProtectionTypeName() {
        return protectionTypeName;
    }

    public void setProtectionTypeName(String protectionTypeName) {
        this.protectionTypeName = protectionTypeName;
    }

    @Override
    public String toString() {
        return "ProtectionType{" +
                "protectionTypeId=" + protectionTypeId +
                ", protectionTypeName='" + protectionTypeName + '\'' +
                '}';
    }
}
