package com.kongzhu.demo.springmvc.model;

import java.util.Date;

import com.kongzhu.demo.springmvc.enumeration.TableTestSex;

/**
 * table_test 表对应的实体类
 * @author caiwenlong
 */
public class TableTest {
    /** 唯一标识，对应表字段 ID（表主键） */
    private Integer id;
    /** 姓名，对应表字段 NAME */
    private String name;
    /** 性别，对应表字段 SEX */
    private TableTestSex sex;
    /** 年龄，对应表字段 AGE */
    private Integer age;
    /** 出生年月，对应表字段 BIRTHDAY */
    private Date birthday;
    /** 登录密码，对应表字段 PASSWORD */
    private String password;
    /** 入职日期，对应表字段 HIRE_DATE */
    private Date hireDate;
    /** 离职标识，对应表字段 DELETED */
    private Boolean deleted;
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public TableTestSex getSex() {
        return sex;
    }
    public void setSex(TableTestSex sex) {
        this.sex = sex;
    }
    public Integer getAge() {
        return age;
    }
    public void setAge(Integer age) {
        this.age = age;
    }
    public Date getBirthday() {
        return birthday;
    }
    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public Date getHireDate() {
        return hireDate;
    }
    public void setHireDate(Date hireDate) {
        this.hireDate = hireDate;
    }
    public Boolean getDeleted() {
        return deleted;
    }
    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }
    public TableTest() {
        super();
    }
    public TableTest(Integer id, String name, TableTestSex sex, Integer age, Date birthday, String password,
            Date hireDate, Boolean deleted) {
        super();
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.birthday = birthday;
        this.password = password;
        this.hireDate = hireDate;
        this.deleted = deleted;
    }
    @Override
    public String toString() {
        return "TableTest [id=" + id + ", name=" + name + ", sex=" + sex + ", age=" + age + ", birthday=" + birthday
                + ", password=" + password + ", hireDate=" + hireDate + ", deleted=" + deleted + "]";
    }
}
