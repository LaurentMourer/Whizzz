package com.whizzz.feature.dao;

import com.whizzz.feature.domain.Feature;
import com.whizzz.helper.ClassPathHelper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabase;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;

import java.util.List;

import static java.util.Collections.singletonList;
import static org.assertj.core.api.Java6Assertions.assertThat;
import static org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType.H2;

@RunWith(MockitoJUnitRunner.class)
public class FeatureDaoTest {

    private final EmbeddedDatabase db = new EmbeddedDatabaseBuilder().setType(H2).addDefaultScripts().build();
    private final ClassPathHelper classPathHelper = new ClassPathHelper();

    private final FeatureDao featureDao = new FeatureDao(db, classPathHelper);

    public void setUp() throws Exception {
    }

    public void tearDown() throws Exception {
        db.shutdown();
    }

    @Test
    public void test_getFeatures() throws Exception {
        final Feature expectedFeature = new Feature(null, 0, "description", 1, null, null);
        final List<Feature> expectedFeatures = singletonList(expectedFeature);

        final int[] ints = featureDao.addFeature(expectedFeatures);
        assertThat(ints[0]).isEqualTo(1);

        final List<Feature> actualFeatures = featureDao.getFeatures();
        assertThat(actualFeatures.size()).isEqualTo(2);
    }


}