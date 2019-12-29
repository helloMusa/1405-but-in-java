package com.psets.pset04;
import java.util.Scanner;

public class VegetableGarden {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int droughtCount = 0;

        System.out.println("Did it rain today (True or False):  ");
        String rainToday = input.nextLine();
        if (rainToday.equals("False")) {
            droughtCount++;
        }

        while (droughtCount != 3) {
            System.out.println("Did it rain today (True or False):  ");
            rainToday = input.nextLine();

            if (rainToday.equals("False")) {
                droughtCount++;
            }
            else if (rainToday.equals("True")) {
                droughtCount = 0;
            }
        }
        System.out.println("Quick! Water your garden before all the plants die and you starve to death!");

    }
}
