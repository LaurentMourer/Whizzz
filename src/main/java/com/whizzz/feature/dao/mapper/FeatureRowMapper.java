package com.whizzz.feature.dao.mapper;

import com.whizzz.feature.domain.Feature;
import org.joda.time.DateTime;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class FeatureRowMapper implements RowMapper<Feature> {

    @Override
    public Feature mapRow(final ResultSet rs, final int rowNum) throws SQLException {
        final Long id = rs.getLong("ID");
        final int status = rs.getInt("STATUS");
        final String description = rs.getString("DESCRIPTION");
        final int ready = rs.getInt("READY");
        final DateTime created = new DateTime(rs.getTimestamp("CREATED"));
        final DateTime modified = new DateTime(rs.getTimestamp("MODIFIED"));

        return new Feature(id, status, description, ready, created, modified);
    }
}
