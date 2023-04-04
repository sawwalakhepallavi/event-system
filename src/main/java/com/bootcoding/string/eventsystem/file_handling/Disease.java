package com.bootcoding.string.eventsystem.file_handling;

import org.springframework.stereotype.Component;

import java.util.Random;
@Component
public class Disease {
    public Patient patient;
    private static String[] names =
            {"polio", "pilia", "chicken pox", "fever",
                    "small pox", "suger", "joint pain", "headache",
                    "prem rog", ".....",":)",
                    ":,)", ":D", ":(", ":O", ":#"};

    public static String getDisease() {
        Random random = new Random();
        int randomIndex = random.nextInt(names.length);
        return names[randomIndex];
    }
}
