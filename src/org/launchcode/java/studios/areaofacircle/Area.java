package org.launchcode.java.studios.areaofacircle;
import java.util.Scanner;


public class Area {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What is the Radius:");
        Double radius = Double.valueOf(input.nextLine());

        Double radiusAgain = Circle.getArea(radius);
        System.out.println("The Radius is " + radiusAgain);
    }
}