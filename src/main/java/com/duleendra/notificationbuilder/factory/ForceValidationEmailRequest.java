package com.duleendra.notificationbuilder.factory;

import com.duleendra.notificationbuilder.mailer.ForceValidationMail;
import com.duleendra.notificationbuilder.mailer.Mail;
import com.duleendra.notificationbuilder.mailer.ValidationMail;

public class ForceValidationEmailRequest extends EmailRequest {
    @Override
    protected Mail create() {
        return new ForceValidationMail();
    }
}
