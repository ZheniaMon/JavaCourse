package ua.training.Test;

import org.junit.Assert;
import org.junit.Test;
import ua.training.Util.Equipment;

public class EquipmentTest {
    Equipment equipment = new Equipment();

    @Test
    public void testGetItemCost() {
        Assert.assertNotEquals(equipment.getEquipmentCost(), 0);
        System.out.println(equipment.getEquipmentCost());
    }

    @Test
    public void testSortByWeight() {
        equipment.sortEquipmentByWeight();
        Assert.assertTrue(equipment.getEquipment().get(0).getItemWeight() < equipment.getEquipment().get(1).getItemWeight());
        System.out.println(equipment);
    }

    @Test
    public void testFindEquipmentByCost() {
        Assert.assertTrue(equipment.findEquipmentByCost(500,700).get(0).getItemCost() > 500);
        System.out.println(equipment.findEquipmentByCost(500,700));
    }
}
