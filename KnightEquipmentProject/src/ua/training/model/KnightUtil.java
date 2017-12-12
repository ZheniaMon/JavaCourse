package ua.training.model;

import ua.training.model.dao.DaoFactory;
import ua.training.model.dao.ItemDao;
import ua.training.model.dao.KnightDao;
import ua.training.model.enity.EquipmentItem;
import ua.training.model.enity.Knight;

import java.util.List;

/**
 * класс для работы с таблицей рыцарь
 */

public class KnightUtil {
    private KnightDao knightDao;
    private Knight knight;

    public KnightUtil(DaoFactory daoFactory) {
        this.knightDao = daoFactory.createKnightDao();
    }

    /**
     * @return возвращает всех рыцарей из бд
     */
    public List<Knight> getAllKnights() {
        return knightDao.findAll();
    }

    /**
     * метод находит рыцаря по его ид
     * @param id ид рыцаря
     * @return рыцарь
     */
    public Knight findKnightById(int id) {
        return knightDao.findById(id);
    }

    /**
     * метод получение экипировки рыцаря
     * @param itemDao объект для работы с таблицей экипировки
     * @return список элементов экипировки
     */
    public List<EquipmentItem> getKnightEquipment(ItemDao itemDao) {
            return itemDao.findAllByKnightId(knight.getKnightId());
    }

    public Knight getKnight() {
        return knight;
    }

    public void setKnight(Knight knight) {
        this.knight = knight;
    }

}
