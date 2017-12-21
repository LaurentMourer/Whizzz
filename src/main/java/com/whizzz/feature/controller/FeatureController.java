package com.whizzz.feature.controller;

import com.whizzz.feature.domain.Feature;
import com.whizzz.feature.service.FeatureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
public class FeatureController {

    private final FeatureService featureService;

    @Autowired
    public FeatureController(final FeatureService featureService) {
        this.featureService = featureService;
    }

    @GetMapping("/features")
    public List getFeatures() {
        return featureService.getFeatures();

    }

    @PostMapping(path = "/features", produces = APPLICATION_JSON_VALUE)
    public void addFeature(@RequestBody final List<Feature> feature) {
        featureService.addFeature(feature);

    }
}
