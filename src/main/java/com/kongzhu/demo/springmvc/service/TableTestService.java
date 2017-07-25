package com.kongzhu.demo.springmvc.service;

import java.util.List;

import com.kongzhu.demo.springmvc.model.TableTest;

/**
 * TableTest 业务逻辑接口
 * @author caiwenlong
 */
public interface TableTestService {
    /**
     * 查询所有
     * @return
     */
    List<TableTest> findAll();
}
