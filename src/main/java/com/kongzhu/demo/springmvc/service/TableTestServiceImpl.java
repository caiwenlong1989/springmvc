package com.kongzhu.demo.springmvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kongzhu.demo.springmvc.mapper.TableTestMapper;
import com.kongzhu.demo.springmvc.model.TableTest;

@Service
public class TableTestServiceImpl implements TableTestService {

    @Autowired
    private TableTestMapper tableTestMapper;

    @Override
    public List<TableTest> findAll() {
        return tableTestMapper.findAll();
    }

}
