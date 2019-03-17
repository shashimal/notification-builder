package com.duleendra.notificationbuilder.factory;

import com.duleendra.notificationbuilder.entity.EmailRequestParameters;
import com.duleendra.notificationbuilder.mailer.Mail;
import com.duleendra.notificationbuilder.mailer.ValidationMail;

public class ValidationEmailRequest extends EmailRequest {
    @Override
    protected Mail create() {
        return new ValidationMail();
    }
}
