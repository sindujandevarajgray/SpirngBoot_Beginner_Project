package com.gray.starter.springbootbeginprjct.event;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.context.ApplicationEvent;

/**
 * Created by IntelliJ IDEA Ultimate.
 * User: Pasindu Raveen
 * Date: 12/15/2021
 * Time: 10:28 AM
 * SpringBoot-BeginPrjct
 */
@Getter
@Setter
public class Event extends ApplicationEvent {
    private String message;

    public Event(Object source, String message) {
        super(source);
        this.message = message;
    }

}
