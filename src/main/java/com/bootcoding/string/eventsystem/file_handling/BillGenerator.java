package com.bootcoding.string.eventsystem.file_handling;

import org.springframework.stereotype.Component;

import java.util.Random;
@Component
public class BillGenerator {
    public Patient patient;
    public static int getBillGenerator(){
        Random random=new Random();
        int i = random.nextInt(50000);
        return i;
    }

//    public static void main(String[] args) {
//        int i = RandomNumberGenerator.generateNumber();
//        System.out.println(i);
//
//    }
}
