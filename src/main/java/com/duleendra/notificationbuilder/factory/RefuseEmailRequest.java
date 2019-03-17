package com.duleendra.notificationbuilder.factory;

import com.duleendra.notificationbuilder.entity.EmailRequestParameters;
import com.duleendra.notificationbuilder.mailer.Mail;
import com.duleendra.notificationbuilder.mailer.RefuseMail;

public class RefuseEmailRequest extends EmailRequest {
    @Override
    protected Mail create() {
        return new RefuseMail();
    }
}
