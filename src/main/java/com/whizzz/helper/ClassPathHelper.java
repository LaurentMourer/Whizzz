package com.whizzz.helper;

import com.google.common.base.Throwables;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Component;

import java.io.IOException;

import static com.google.common.base.Charsets.UTF_8;
import static org.springframework.util.StreamUtils.copyToString;


@Component
public class ClassPathHelper {

    public String copyClassPathResourcesToString(final String path) {
        return getContent(path);
    }

    private String getContent(final String path) {
        try {
            return copyToString(new ClassPathResource(path).getInputStream(), UTF_8).trim();
        } catch (final IOException e) {
            throw Throwables.propagate(e);
        }
    }
}

