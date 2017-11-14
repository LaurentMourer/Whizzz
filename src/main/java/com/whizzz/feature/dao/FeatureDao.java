package com.whizzz.feature.dao;

import com.whizzz.feature.dao.mapper.FeatureRowMapper;
import com.whizzz.feature.domain.Feature;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class FeatureDao {

    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public FeatureDao(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<Feature> selectFeatures() {
        final String sql = "SELECT * FROM FEATURE";

        return jdbcTemplate.query(sql, new FeatureRowMapper());
    }

}
