package com.gray.starter.springbootbeginprjct.controllers;


import com.gray.starter.springbootbeginprjct.configs.EmailProperties;
import com.gray.starter.springbootbeginprjct.services.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmailController {

    private final EmailService emailService;

    @Autowired
    public EmailController(EmailService emailService) {
        this.emailService = emailService;
    }

    @RequestMapping(value = "emails/send")
    public String sendEmail() {
        return emailService.sendEmail(EmailProperties.getEmailProperties());
    }

    @RequestMapping(value = "emails/multiple-send")
    public String sendMultipleEmail() {

        String multipleEmail = "sent";
        for (int i = 0; i < 5; i++) {
            multipleEmail = emailService.sendMultipleEmail(EmailProperties.getEmailProperties());
        }
        return multipleEmail;
    }
}