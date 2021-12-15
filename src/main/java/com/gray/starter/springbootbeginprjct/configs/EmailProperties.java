package com.gray.starter.springbootbeginprjct.configs;

import java.util.Date;
import java.util.Properties;

/**
 * Created by IntelliJ IDEA Ultimate.
 * User: Pasindu Raveen
 * Date: 12/14/2021
 * Time: 11:13 PM
 * SpringBoot-BeginPrjct
 */

public class EmailProperties {
    public static Properties getEmailProperties(){

        Properties properties = new Properties();

        properties.setProperty("to", "graysteamerzoom@gmail.com");
        properties.setProperty("from", "automated@noreply");
        properties.setProperty("subject", "Automated Email");
        properties.setProperty("template_name", "email_body");

        properties.setProperty("API", "TEST API");
        properties.setProperty("reportedOn", new Date() + "");
        properties.setProperty("message", "Incident occurred in the Test API");

        return properties;
    }

}
