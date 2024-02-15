package prac;

import java.util.Scanner;

public class P2 {
    public static void main(String[] args) {
        System.out.println("For equ 1 & equ 2 ");

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a  :  ");
        double a = sc.nextDouble();

        System.out.println("Enter the value of b  :  ");
        double b = sc.nextDouble();

        System.out.println("Enter the value of c  :  ");
        double c = sc.nextDouble();

        System.out.println("Enter the value of d  :  ");
        double d = sc.nextDouble();

        System.out.println("Enter the value of e  :  ");
        double e = sc.nextDouble();

        System.out.println("Enter the value of f  :  ");
        double f = sc.nextDouble();

        double x = ((e * d) - (b * f)) / ((a * d) - (b * c));
        double y = ((a * f) - (e * c)) / ((a * d) - (b * c));

        System.out.println("The value of x is : ");
        System.out.println(x);
        System.out.println("The value of y is : ");
        System.out.println(y);


    }


}
