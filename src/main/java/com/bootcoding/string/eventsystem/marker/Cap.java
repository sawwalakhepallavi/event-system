package com.bootcoding.string.eventsystem.marker;

import org.springframework.stereotype.Component;

@Component
public class Cap {
    public String color;
    public String shape;
    public String material;
    public Cap(){
        material="solid";
        shape="circle";
        color="blue";
        System.out.println(" I'm using the "+ material+" with the shape "+ shape+ " & "+color);
    }
}
