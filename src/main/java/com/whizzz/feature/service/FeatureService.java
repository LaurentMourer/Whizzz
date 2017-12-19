package com.whizzz.feature.service;

import com.whizzz.feature.dao.FeatureDao;
import com.whizzz.feature.domain.Feature;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FeatureService {

    private final FeatureDao featureDao;

    @Autowired
    public FeatureService(final FeatureDao featureDao) {
        this.featureDao = featureDao;
    }

    public List getFeatures() {
        return featureDao.getFeatures();
    }

    public void addFeature(final List<Feature> features) {
        featureDao.addFeature(features);

    }
}
