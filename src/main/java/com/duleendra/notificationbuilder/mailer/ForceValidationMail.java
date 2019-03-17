package com.duleendra.notificationbuilder.mailer;

import com.duleendra.notificationbuilder.email.EmailTemplate;
import com.duleendra.notificationbuilder.email.EmailTemplateParser;
import com.duleendra.notificationbuilder.entity.Email;
import com.duleendra.notificationbuilder.entity.EmailRequestParameters;
import org.apache.commons.io.FileUtils;
import org.apache.commons.text.StringSubstitutor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;


@Component
public class ForceValidationMail extends Mail {


    @Override
    public Email createMail(EmailRequestParameters emailRequestParameters) throws IOException {
        System.out.println("Force Validation Mail Ojject");
        Email email = new Email();

        Map<String, String> data = new HashMap<String, String>();
        data.put("fistName", "Shashimal");
        data.put("Request", "Technical");

        //get body template
        EmailTemplateParser emailTemplate = new EmailTemplate();
        String templateBody = "/Users/duleendra/IdeaProjects/notification-builder/src/main/resources/validation_body_en.txt";
        String content = emailTemplate.parseEmailTemplate(templateBody, data);
        System.out.println(content);
        //get subject template

        //parse the body and subject templates


        return email;
    }
}
