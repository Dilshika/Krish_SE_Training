package main.java.com.dil.datatypes.primitive;

import java.util.Scanner;

public class BooleanDataType {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Today is a rainy day? true/false");
        boolean isRain = scanner.nextBoolean();

        if (isRain) {
            System.out.println("You can't play today it's raining");
        } else {
            System.out.println("Enjoy the day ");
        }
    }
}
