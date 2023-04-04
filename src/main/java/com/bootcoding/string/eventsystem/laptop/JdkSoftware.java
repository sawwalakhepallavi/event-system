package com.bootcoding.string.eventsystem.laptop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;



@Component
public class JdkSoftware {
    @Autowired
    public Version version;

    public JdkSoftware(Version version) {
        this.version = version;
//        print();
    }

//    private void print() {
//        System.out.println(version.ver);
//    }

}
