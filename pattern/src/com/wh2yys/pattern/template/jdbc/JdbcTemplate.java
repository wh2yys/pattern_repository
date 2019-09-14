package com.wh2yys.pattern.template.jdbc;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author wh
 * @description
 * @date 2019/9/12
 */
public class JdbcTemplate {
    private DataSource dataSource;

    public JdbcTemplate(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public List executeQuery(String sql, RowMapper<?> rowMapper, Object[] values) {
        try {
            Connection connection = this.getConnection();
            PreparedStatement pstm = this.createPrepareStatement(connection, sql);
            ResultSet rs = this.executeQuery(pstm, values);
            List resultSet = this.paresResultSet(rs, rowMapper);
            this.closeResultSet(rs);
            this.closeStatement(pstm);
            this.closeConnection(connection);
            return resultSet;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    private void closeConnection(Connection connection) {
        try {
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private void closeStatement(PreparedStatement pstm) {
        try {
            pstm.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private void closeResultSet(ResultSet rs) {
        try {
            rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private List paresResultSet(ResultSet rs, RowMapper<?> rowMapper) throws Exception {
        List<Object> result=new ArrayList<>();
        int rowNum=1;
        while (rs.next()){
            result.add(rowMapper.mapRow(rs,rowNum++));
        }
        return result;
    }

    private ResultSet executeQuery(PreparedStatement pstm, Object[] values) throws SQLException {
        for (int i = 0; i < values.length; i++) {
            pstm.setObject(i,values[i]);
        }
        return pstm.executeQuery();
    }

    private PreparedStatement createPrepareStatement(Connection connection, String sql) throws SQLException {
        return connection.prepareStatement(sql);
    }

    private Connection getConnection() throws SQLException {
        return this.dataSource.getConnection();
    }
}
