package com.whizzz.feature.dao;

import com.whizzz.feature.dao.mapper.FeatureRowMapper;
import com.whizzz.feature.domain.Feature;
import com.whizzz.helper.ClassPathHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BatchPreparedStatementSetter;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

@Repository
public class FeatureDao {

    private final JdbcTemplate jdbcTemplate;
    private final ClassPathHelper classPathHelper;


    @Autowired
    public FeatureDao(final DataSource dataSource, final ClassPathHelper classPathHelper) {
        jdbcTemplate = new JdbcTemplate(dataSource);
        this.classPathHelper = classPathHelper;
    }

    public List<Feature> getFeatures() {

        final String query = classPathHelper.copyClassPathResourcesToString("sql/feature/getFeatures.sql");

        return jdbcTemplate.query(query, new FeatureRowMapper());
    }

    public int[] addFeature(final List<Feature> features) {
        final String query = classPathHelper.copyClassPathResourcesToString("sql/feature/addFeature.sql");

        return jdbcTemplate.batchUpdate(query, new BatchPreparedStatementSetter() {
            @Override
            public void setValues(final PreparedStatement ps, final int i) throws SQLException {
                final Feature feature = features.get(i);
                ps.setInt(1, feature.getStatus());
                ps.setString(2, feature.getDescription());
                ps.setInt(3, feature.isReady());
            }

            @Override
            public int getBatchSize() {
                return features.size();
            }
        });
    }


}
