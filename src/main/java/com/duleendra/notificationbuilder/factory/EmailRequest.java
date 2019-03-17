package com.duleendra.notificationbuilder.factory;


import com.duleendra.notificationbuilder.entity.Email;
import com.duleendra.notificationbuilder.entity.EmailRequestParameters;
import com.duleendra.notificationbuilder.mailer.Mail;

import java.io.IOException;

public abstract class EmailRequest {

    public Email createEmailRequest(EmailRequestParameters emailRequestParameters) throws IOException {
        Mail mail = create();
        return mail.createMail(emailRequestParameters);
    }

    protected abstract Mail create();
}
