package com.whizzz.feature.dao.mapper;

import com.whizzz.feature.domain.Feature;
import org.springframework.jdbc.core.BatchPreparedStatementSetter;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public final class FeatureBatchPreparedStatement {

    public final static FeatureBatchPreparedStatement FEATURE_BATCH_PREPARED_STATEMENT = new FeatureBatchPreparedStatement();

    private FeatureBatchPreparedStatement() {
        // NOP
    }

    public BatchPreparedStatementSetter getBatchPreparedStatementSetter(final List<Feature> features) {
        return new BatchPreparedStatementSetter() {
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
        };
    }
}
