package com.whizzz.feature.dao;

import com.whizzz.feature.dao.mapper.FeatureRowMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class FeatureDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List getFeatures() {
        String sql = "SELECT * FROM FEATURE";

        return jdbcTemplate.query(sql,
                new FeatureRowMapper());
    }

}
