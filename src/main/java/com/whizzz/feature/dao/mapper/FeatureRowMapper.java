package com.whizzz.feature.dao.mapper;

import com.whizzz.feature.domain.Feature;
import org.joda.time.DateTime;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class FeatureRowMapper implements RowMapper {

    public Feature mapRow(ResultSet rs, int rowNum) throws SQLException {
        long id = rs.getLong("ID");
        int status = rs.getInt("STATUS");
        String description = rs.getString("DESCRIPTION");
        boolean ready = rs.getBoolean("READY");
        DateTime created = new DateTime(rs.getTimestamp("CREATED"));
        DateTime modified = new DateTime(rs.getTimestamp("MODIFIED"));

        return new Feature(id, status, description, ready, created, modified);
    }
}
