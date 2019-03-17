package com.duleendra.notificationbuilder.email;

import org.apache.commons.io.FileUtils;
import org.apache.commons.text.StringSubstitutor;
import org.springframework.stereotype.Component;

import java.io.File;
import java.io.IOException;
import java.util.Map;

@Component
public class EmailTemplate implements EmailTemplateParser {

    @Override
    public String parseEmailTemplate(String template, Map<String, String> data) throws IOException {
        File emailTemplate = new File(template);
        String content =  FileUtils.readFileToString(emailTemplate, "utf-8");
        return StringSubstitutor.replace(content, data);
    }
}
