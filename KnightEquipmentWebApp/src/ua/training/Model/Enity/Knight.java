package ua.training.Model.Enity;

import ua.training.Model.Enity.EquipmentItem;

import java.util.List;

public class Knight {
    private int knightId;
    private String knightName;
    private int knightAge;
    private List<EquipmentItem> equipment;

    public Knight() {
    }

    public Knight(int knightId, String knightName,
                  int knightAge, List<EquipmentItem> equipment) {
        this.knightId = knightId;
        this.knightName = knightName;
        this.knightAge = knightAge;
        this.equipment = equipment;
    }

    public int getKnightId() {
        return knightId;
    }

    public void setKnightId(int knightId) {
        this.knightId = knightId;
    }

    public String getKnightName() {
        return knightName;
    }

    public void setKnightName(String knightName) {
        this.knightName = knightName;
    }

    public int getKnightAge() {
        return knightAge;
    }

    public void setKnightAge(int knightAge) {
        this.knightAge = knightAge;
    }

    public List<EquipmentItem> getEquipment() {
        return equipment;
    }

    public void setEquipment(List<EquipmentItem> equipment) {
        this.equipment = equipment;
    }

    @Override
    public String toString() {
        return "Knight{" +
                "knightId=" + knightId +
                ", knightName='" + knightName + '\'' +
                ", knightAge=" + knightAge +
                ", equipment=" + equipment +
                '}';
    }
}
