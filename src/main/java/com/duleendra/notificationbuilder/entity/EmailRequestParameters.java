package com.duleendra.notificationbuilder.entity;

import java.util.HashMap;
import java.util.Map;

public class EmailRequestParameters {
    private Map<String, Object> parameters;

    public void addParameter(String key, String value) {
        if (this.parameters == null) {
            parameters = new HashMap<>();
        }
        parameters.put(key, value);
    }

    public Map<String, Object> getParameters() {
        return this.parameters;
    }
}
