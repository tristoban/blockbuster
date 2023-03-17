package com.buster.blockbuster.repository;

import java.util.List;

public interface IDao<T> {
    T save(T t);
    T searchByName(String name);
    T searchById(Long id);
    void delete(Long id);
    List<T> searchAll();
    T update(T t);
}
