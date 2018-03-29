package com.example.messages.controllers;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.jms.Queue;

@RestController
@RequestMapping("/messages")
@Api(description = "messages api")
public class MessageController {

    private JmsTemplate jmsTemplate;
    private Queue queue;

    public MessageController(JmsTemplate jmsTemplate, Queue queue) {
        this.jmsTemplate = jmsTemplate;
        this.queue = queue;
    }

    @ApiOperation(value = "Send simple message", notes = "Some notes")
    @GetMapping(value = "/{message}")
    public String sendMessage(@PathVariable String message) {

        jmsTemplate.convertAndSend(queue, message);

        return message;

    }


}
