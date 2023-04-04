package com.bootcoding.string.eventsystem.marker;

import com.bootcoding.string.eventsystem.marker.Cap;
import com.bootcoding.string.eventsystem.marker.Ink;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Marker {
    @Autowired
    private Cap cap;
    private Ink ink;
    public Marker(Cap cap,Ink ink){
        this.cap=cap;
        this.ink=ink;
        print();
        System.out.println("im in marker");
    }
    public void print(){
        System.out.println("Ink in this form "+ink.form);
        System.out.println("Color of Ink is "+ink.color);
    }
}
