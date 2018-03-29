package com.example.messages.domain;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@Setter
@ToString
public class Message {

    private String subject;
    private String text;
    private List<Person> persons;

}
