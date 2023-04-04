package com.bootcoding.string.eventsystem.file_handling;

import org.springframework.stereotype.Component;

import java.util.Random;
@Component
public class PatientName {
    public Patient patient;
    private static String[] names =
            {"Ramesh", "Suresh", "Jayesh", "Ganesh",
                    "Mahesh", "Rajesh", "Mitesh", "Dinesh",
                    "Pooja", "Priya", "Pinky",
                    "Manisha", "Usha", "Asha", "Diksha", "Nisha"};

    public static String getName() {
//        int randomIndex=0;
//        for (int i = 0; i < 100; i++) {
            Random random = new Random();
            int randomIndex = random.nextInt(names.length);
            return names[randomIndex];
//        }
//        return names[randomIndex];
    }

//    public static void main(String[] args) {
//        PatientName.getName();
//    }
}
