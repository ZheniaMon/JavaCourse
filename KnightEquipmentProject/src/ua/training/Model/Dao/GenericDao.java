package ua.training.model.dao;

import java.util.List;

public interface GenericDao<T> extends AutoCloseable {
    void create(T entity);
    void update(T entity);
    void delete(int id);
    T findById(int id);
    List<T> findAll();
}
