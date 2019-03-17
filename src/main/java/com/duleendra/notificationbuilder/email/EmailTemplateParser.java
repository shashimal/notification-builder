package com.duleendra.notificationbuilder.email;

import org.springframework.stereotype.Component;

import java.io.File;
import java.io.IOException;
import java.util.Map;

public interface EmailTemplateParser {
    String parseEmailTemplate(String template, Map<String,String> data) throws IOException;

}
