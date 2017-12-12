package test;

import org.junit.*;
import ua.training.model.Equipment;
import ua.training.model.Model;
import ua.training.model.enity.Knight;

/**
 * класс тестирует функции экипировки
 */

public class FunctionTest {
    static Model model = new Model();
    static Knight knight = model.findKnightById(2);

    @BeforeClass
    public static void initilizate() {
        model.getKnightUtil().setKnight(knight);
        model.setEquipment(new Equipment(model.getKnightUtil().getKnightEquipment(model.getItemDao())));
    }

    @Test
    public void testGetEquipmentCost() {
        Assert.assertEquals(model.getEquipmentCost(), 1500,0);
    }

    @Test
    public void testSortByWeight() {
        model.sortEquipment();
        Assert.assertTrue(model.getEquipment().getEquipment().get(0).getItemWeight() < model.getEquipment().getEquipment().get(1).getItemWeight());
    }

    @Test
    public void testFindItemsInRange() {
       Assert.assertEquals(model.getItemsInRange(400,600).get(0).getItemCost(), 500,0);
    }
}
