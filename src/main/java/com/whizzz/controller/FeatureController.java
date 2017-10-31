package com.whizzz.controller;

import com.whizzz.feature.domain.Feature;
import com.whizzz.feature.service.FeatureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class FeatureController {

    private final FeatureService featureService;

    @Autowired
    public FeatureController(FeatureService featureService) {
        super();
        this.featureService = featureService;
    }

    @GetMapping("/features")
    public List<Feature> getFeatures() {
        return featureService.getFeature();

    }
}
