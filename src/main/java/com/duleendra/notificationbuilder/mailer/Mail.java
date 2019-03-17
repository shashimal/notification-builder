package com.duleendra.notificationbuilder.mailer;

import com.duleendra.notificationbuilder.entity.Email;
import com.duleendra.notificationbuilder.entity.EmailRequestParameters;

import java.io.IOException;

public abstract class Mail {

    public abstract Email createMail(EmailRequestParameters emailRequestParameters) throws IOException;
}
