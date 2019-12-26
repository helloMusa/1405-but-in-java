package com.psets.pset02;
import java.text.DecimalFormat;
import java.util.Scanner;

public class conversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat numFormat = new DecimalFormat("#.00");

        System.out.println("Enter USD amount: ");
        double usd = sc.nextDouble();
        double cad = usd * 1.32;

        System.out.printf("%s USD is %s CAD.", numFormat.format(usd), numFormat.format(cad));
    }
}
