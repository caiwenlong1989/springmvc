package com.kongzhu.demo.springmvc.handler;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.MappedJdbcTypes;

import com.kongzhu.demo.springmvc.enumeration.TableTestSex;

@MappedJdbcTypes(JdbcType.TINYINT)
public class TableTestSexHandler extends BaseTypeHandler<TableTestSex> {

    @Override
    public void setNonNullParameter(PreparedStatement ps, int i, TableTestSex parameter, JdbcType jdbcType)
            throws SQLException {
       ps.setByte(i, parameter.getValue());
    }

    @Override
    public TableTestSex getNullableResult(ResultSet rs, String columnName) throws SQLException {
        Byte value = rs.getByte(columnName);
        TableTestSex[] tableTestSexs = TableTestSex.values();
        for (TableTestSex tableTestSex : tableTestSexs) {
            if (tableTestSex.getValue().equals(value)) {
                return tableTestSex;
            }
        }
        return null;
    }

    @Override
    public TableTestSex getNullableResult(ResultSet rs, int columnIndex) throws SQLException {
        Byte value = rs.getByte(columnIndex);
        TableTestSex[] tableTestSexs = TableTestSex.values();
        for (TableTestSex tableTestSex : tableTestSexs) {
            if (tableTestSex.getValue().equals(value)) {
                return tableTestSex;
            }
        }
        return null;
    }

    @Override
    public TableTestSex getNullableResult(CallableStatement cs, int columnIndex) throws SQLException {
        Byte value = cs.getByte(columnIndex);
        TableTestSex[] tableTestSexs = TableTestSex.values();
        for (TableTestSex tableTestSex : tableTestSexs) {
            if (tableTestSex.getValue().equals(value)) {
                return tableTestSex;
            }
        }
        return null;
    }

}
