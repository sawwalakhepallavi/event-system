package com.bootcoding.string.eventsystem.marker;

import org.springframework.stereotype.Component;

@Component
public class Ink {
    public String form;
    public String color;
    public Ink(){
        form="liquid";
        color="blue";
    }
}
