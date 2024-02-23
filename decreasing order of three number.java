package prac;

import java.util.Scanner;

public class P5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your first number : ");
        int a = sc.nextInt();

        System.out.print("Enter your second number : ");
        int b = sc.nextInt();

        System.out.print("Enter your third number : ");
        int c = sc.nextInt();

        if (a > b && a > c) {
            if (b > c) {
                System.out.println(a);
                System.out.println(b);
                System.out.println(c);
            } else {
                System.out.println(a);
                System.out.println(c);
                System.out.println(b);
            }
        }
        else if (b > a && b > c) {
            if (c > a) {
                System.out.println(b);
                System.out.println(c);
                System.out.println(a);
            } else {
                System.out.println(b);
                System.out.println(a);
                System.out.println(c);
            }
        }
        else {
            if (a > b) {
                System.out.println(c);
                System.out.println(a);
                System.out.println(b);
            } else {
                System.out.println(c);
                System.out.println(b);
                System.out.println(a);
            }
        }




    }
}
