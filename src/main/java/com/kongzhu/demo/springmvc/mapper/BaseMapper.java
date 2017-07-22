package com.kongzhu.demo.springmvc.mapper;

import java.io.Serializable;
import java.util.List;

public interface BaseMapper<T, ID extends Serializable> {
    T insert(T entity);
    
    int delete(ID id);
    int delete(T entity);
    
    T update(T entity);
    
    T findOne(ID id);
    boolean exists(ID id);
    long count();
    List<T> findAll();
}
