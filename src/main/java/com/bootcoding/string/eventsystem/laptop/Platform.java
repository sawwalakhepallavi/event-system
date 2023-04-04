package com.bootcoding.string.eventsystem.laptop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Platform {

    public Macos macos;

    public Linux linux;

    public Windows windows;


    public Platform(Macos macos, Linux linux, Windows windows) {
        this.macos = macos;
        this.linux = linux;
        this.windows = windows;
    }

}
