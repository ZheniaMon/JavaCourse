package ua.training.Model.Knight;

import ua.training.Model.Equipment.EquipmentItem;
import java.util.*;

public class Knight extends Human {
    private List<EquipmentItem> equipmentItemList;

    public Knight(String name, int age, List<EquipmentItem> equipmentItemList) {
        super(name, age);
        this.equipmentItemList = equipmentItemList;
    }

    public List<EquipmentItem> getEquipmentItemList() {
        return equipmentItemList;
    }

    public void setEquipmentItemList(List<EquipmentItem> equipmentItemList) {
        this.equipmentItemList = equipmentItemList;
    }
}
