package com.bootcoding.string.eventsystem.laptop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component

public class Laptop {
    @Autowired
    private Platform platform;
    private JdkSoftware jdkSoftware;

    public Laptop(Platform platform, JdkSoftware jdkSoftware) {
        this.platform = platform;
        this.jdkSoftware = jdkSoftware;
        print();
    }
    private void print() {
        System.out.println(jdkSoftware.version.ver);
    }


}
