package com.bootcoding.string.eventsystem.frigde;

import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class FridgeUtils {
    private static String[] brands = {"LG", "Sangsum", "godrej", "haier", "whirlpool","Bosch","croma"};
    private static String[] colors={"blue","white","green","black","grey"};

    public static String getBrand(){
        Random random = new Random();
        int randomIndex = random.nextInt(brands.length);
        String brand = brands[randomIndex];
        return brand;
    }
    public static String getColor(){
        Random random = new Random();
        int randomIndex = random.nextInt(colors.length);
        String color = colors[randomIndex];
        return color;
    }
    public static int getPrice(){
        Random random=new Random();
        int i = random.nextInt(100000);
        return i;
    }
    public static int getStar(){
        Random random=new Random();
        int i = random.nextInt(5);
        return i;
    }


}
