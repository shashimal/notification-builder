package com.duleendra.notificationbuilder.mailer;

import com.duleendra.notificationbuilder.entity.Email;
import com.duleendra.notificationbuilder.entity.EmailRequestParameters;

public class RefuseMail extends Mail {
    @Override
    public Email createMail(EmailRequestParameters emailRequestParameters) {
        System.out.println("Refuse Mail Object");
        Email email = new Email();
        email.setId(1);
        email.setSubject("Refused Email");
        email.setBody("Body");
        return email;
    }
}
