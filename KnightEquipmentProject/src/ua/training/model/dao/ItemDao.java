package ua.training.model.dao;

import ua.training.model.enity.EquipmentItem;

import java.util.List;

public interface ItemDao extends GenericDao<EquipmentItem> {
    List<EquipmentItem> findAllByKnightId(int id);
}
