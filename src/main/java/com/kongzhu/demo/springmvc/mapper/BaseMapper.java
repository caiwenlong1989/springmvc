package com.kongzhu.demo.springmvc.mapper;

import java.io.Serializable;
import java.util.List;

/**
 * MyBatis Mapper 接口的基础接口
 * @author caiwenlong
 *
 * @param <T> 对应接口操作的实体类
 * @param <ID> 对应接口操作的实体类的主键属性的变量类型
 */
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
