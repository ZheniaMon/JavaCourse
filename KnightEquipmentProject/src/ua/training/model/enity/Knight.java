package ua.training.model.enity;

import java.util.List;
import static ua.training.model.constants.KnightStrings.*;

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
                " Id=" + knightId +
                ", Name='" + knightName + '\'' +
                ", Age=" + knightAge + "\n" +
                " equipment=" + equipment +
                '}' + "\n";
    }
}
