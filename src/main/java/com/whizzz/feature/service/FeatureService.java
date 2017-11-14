package com.whizzz.feature.service;

import com.whizzz.feature.dao.FeatureDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FeatureService {

    private final FeatureDao featureDao;

    @Autowired
    public FeatureService(FeatureDao featureDao) {
        this.featureDao = featureDao;
    }

    public List getFeature() {
        return featureDao.selectFeatures();
    }
}
