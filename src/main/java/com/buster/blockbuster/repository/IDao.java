package com.buster.blockbuster.repository;

import java.util.List;

public interface IDao<T> {
    T save(T t);
    T searchByName(String name);
    T searchById(Integer id);
    void delete(Integer id);
    List<T> searchAll();
    T update(T t);
}
