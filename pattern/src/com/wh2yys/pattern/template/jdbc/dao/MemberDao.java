package com.wh2yys.pattern.template.jdbc.dao;

import com.wh2yys.pattern.template.jdbc.JdbcTemplate;
import com.wh2yys.pattern.template.jdbc.RowMapper;

import javax.sql.DataSource;
import java.sql.ResultSet;
import java.util.List;

/**
 * @author wh
 * @description
 * @date 2019/9/12
 */
public class MemberDao extends JdbcTemplate {
    public MemberDao(DataSource dataSource) {
        super(dataSource);
    }

    public List<?> selectAll(){
        String sql="select * from t_member";
        return super.executeQuery(sql, new RowMapper<Member>() {
            @Override
            public Member mapRow(ResultSet rs, int rowNum) throws Exception {
                Member member=new Member();
                member.setUsername(rs.getNString("username"));
                member.setPassword(rs.getNString("password"));
                member.setAddr(rs.getNString("username"));
                member.setAddr(rs.getNString("username"));
                return member;
            }
        },null);
    }
}
