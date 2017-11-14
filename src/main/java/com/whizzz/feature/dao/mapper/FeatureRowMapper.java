package com.whizzz.feature.dao.mapper;

import com.whizzz.feature.domain.Feature;
import org.joda.time.DateTime;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class FeatureRowMapper implements RowMapper<Feature> {

    public Feature mapRow(ResultSet rs, int rowNum) throws SQLException {
        final long id = rs.getLong("ID");
        final int status = rs.getInt("STATUS");
        final String description = rs.getString("DESCRIPTION");
        final boolean ready = rs.getBoolean("READY");
        final DateTime created = new DateTime(rs.getTimestamp("CREATED"));
        final DateTime modified = new DateTime(rs.getTimestamp("MODIFIED"));

        return new Feature(id, status, description, ready, created, modified);
    }
}
