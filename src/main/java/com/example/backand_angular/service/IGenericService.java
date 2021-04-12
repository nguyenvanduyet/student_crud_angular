package com.example.backand_angular.service;

import java.util.List;

public interface IGenericService<T> {
    List<T> findAll();
    T save (T t);
    void delete (Long id);
    T create (T t);


}
