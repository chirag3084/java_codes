package prac;

import java.util.Scanner;

public class P4 {
    public static void main(String[] args) {
        float BMI;
        float pound;
        float inches;


        Scanner sc = new Scanner(System.in);
        System.out.println("The values of pound (kilogram) is : ");
        pound = sc.nextFloat();
        System.out.println("The vales of inches (meter) is : ");
        inches = sc.nextFloat();


        BMI = (pound) / (inches * inches);
        System.out.println("The value of BMI is : ");
        System.out.println(BMI);

    }
}
