package com.whizzz.feature.dao;

import com.whizzz.feature.dao.mapper.FeatureRowMapper;
import com.whizzz.feature.domain.Feature;
import com.whizzz.helper.ClassPathHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BatchPreparedStatementSetter;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.List;

import static com.whizzz.feature.dao.mapper.FeatureBatchPreparedStatment.featureBatchPreparedStatment;

@Component
public class FeatureDao {

    private final JdbcTemplate jdbcTemplate;
    private final ClassPathHelper classPathHelper;


    @Autowired
    public FeatureDao(final JdbcTemplate jdbcTemplate, final ClassPathHelper classPathHelper) {
        this.jdbcTemplate = jdbcTemplate;
        this.classPathHelper = classPathHelper;
    }

    public List<Feature> getFeatures() {

        final String query = classPathHelper.copyClassPathResourcesToString("sql/feature/getFeatures.sql");

        return jdbcTemplate.query(query, new FeatureRowMapper());
    }

    public int[] addFeature(final List<Feature> features) {
        final String query = classPathHelper.copyClassPathResourcesToString("sql/feature/addFeature.sql");

        final BatchPreparedStatementSetter batchPreparedStatementSetter = featureBatchPreparedStatment.getBatchPreparedStatementSetter(features);

        return jdbcTemplate.batchUpdate(query, batchPreparedStatementSetter);
    }


}
