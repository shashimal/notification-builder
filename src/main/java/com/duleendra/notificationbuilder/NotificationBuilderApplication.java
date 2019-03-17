package com.duleendra.notificationbuilder;

import com.duleendra.notificationbuilder.entity.Email;
import com.duleendra.notificationbuilder.entity.EmailRequestParameters;
import com.duleendra.notificationbuilder.factory.EmailRequest;
import com.duleendra.notificationbuilder.factory.ForceValidationEmailRequest;
import com.duleendra.notificationbuilder.factory.RefuseEmailRequest;
import com.duleendra.notificationbuilder.factory.ValidationEmailRequest;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;

@SpringBootApplication
public class NotificationBuilderApplication {

    @Value("${email.template.validation.body.en}")
    private static String userBucketPath;

    public static void main(String[] args) throws IOException {
        System.out.println(userBucketPath);
        String mail = "validate";
        EmailRequest emailRequest = null;
        EmailRequestParameters emailRequestParameters = new EmailRequestParameters();
        emailRequestParameters.addParameter("lan","English");

        if (mail.equals("validate")) {
            emailRequest = new ForceValidationEmailRequest();
        } else {
            emailRequest = new RefuseEmailRequest();
        }

        Email email = emailRequest.createEmailRequest(emailRequestParameters);
        System.out.println(email);

        SpringApplication.run(NotificationBuilderApplication.class, args);


    }

}
