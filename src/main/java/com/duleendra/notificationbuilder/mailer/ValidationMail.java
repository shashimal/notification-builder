package com.duleendra.notificationbuilder.mailer;

import com.duleendra.notificationbuilder.entity.Email;
import com.duleendra.notificationbuilder.entity.EmailRequestParameters;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


public class ValidationMail extends Mail {



    @Override
    public Email createMail(EmailRequestParameters emailRequestParameters) {
        System.out.println("Validation Mail Ojject" );

        //Parse the email templates with the given content
        Email email = new Email();
        email.setId(1);
        email.setSubject("Validation Email");
        email.setBody("Body");

        return email;
    }
}
