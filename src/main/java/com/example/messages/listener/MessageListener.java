package com.example.messages.listener;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class MessageListener {

    @JmsListener(destination = "test.queue1")
    public void listener(String message) {
        System.out.println(message);
    }


}
