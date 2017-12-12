package ua.training.model.constants;

public interface DaoConstants {
    String CONNECTION_STRING = "jdbc:mysql://localhost:3306/EquipmentDB?autoReconnect=true&useSSL=false";
    String USER = "root";
    String PASSWORD = "Base4171Sq6Roo7";

    String CREATE_ITEM = "INSERT INTO equipmentitem (itemType, itemName," +
            " itemCost, itemWeight," +
            " itemSize, knightId)" +
            " VALUES (? ,?, ?, ?, ?, ?)";
    String UPDATE_ITEM = "UPDATE equipmentitem SET itemType = ? ," +
            " itemName = ?, itemCost = ?," +
            "itemWeight = ?, itemSize = ?," +
            "knightId = ? " +
            "WHERE id = ?";
    String DELETE_ITEM = "DELETE FROM equipmentitem WHERE id = ?";
    String FIND_ITEM_BY_ID = "SELECT * FROM equipmentitem WHERE id = ?";
    String FIND_ALL_ITEMS = "SELECT * FROM equipmentitem";
    String FIND_ALL_ITEMS_BY_KNIGHT_ID = "Select * from equipmentitem where knightId=?;";

    String CREATE_KNIGHT = "INSERT INTO knight (knightName, knightAge)" +
            " VALUES (? ,? )";
    String UPDATE_KNIGHT = "UPDATE knight SET knightName = ? , knightAge = ?  " +
            "WHERE id = ?";
    String DELETE_KNIGHT = "DELETE FROM knight WHERE id = ?";
    String FIND_KNIGHT_BY_ID = "SELECT * FROM knight JOIN equipmentitem e ON knight.knightId = e.knightId WHERE knight.knightId = ?;";
    String FIND_ALL_KNIGHTS = "SELECT * " +
            "FROM knight";
}
