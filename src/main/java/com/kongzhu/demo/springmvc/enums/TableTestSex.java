package com.kongzhu.demo.springmvc.enums;

/**
 * TableTest 实体类中 sex 属性的枚举类
 * @author caiwenlong
 */
public enum TableTestSex {
    女((byte) 0),
    男((byte) 1),
    保密((byte) 2);

    private Byte value;

    public Byte getValue() {
        return value;
    }

    public void setValue(Byte value) {
        this.value = value;
    }

    private TableTestSex(Byte value) {
        this.value = value;
    }
}
