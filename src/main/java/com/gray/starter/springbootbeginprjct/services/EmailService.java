package com.gray.starter.springbootbeginprjct.services;

import java.util.Properties;

/**
 * Created by IntelliJ IDEA Ultimate.
 * User: Pasindu Raveen
 * Date: 12/14/2021
 * Time: 11:14 PM
 * SpringBoot-BeginPrjct
 */
public interface EmailService {
    String sendEmail(Properties properties);
    String sendMultipleEmail(Properties properties);
}