package com.kongzhu.demo.springmvc.model;

import java.util.Date;

import com.kongzhu.demo.springmvc.enumeration.TableTestSex;

public class TableTest {
    private Integer id;
    private String name;
    private TableTestSex sex;
    private Integer age;
    private Date birthday;
    private String password;
    private Date hireDate;
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
