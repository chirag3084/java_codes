package prac;

import java.util.Scanner;

public class P3 {
    public static void main(String[] args) {
        int meter;
        float feet;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of meter : ");
        meter = sc.nextInt();
        feet = (float) (3.28 * meter);
        System.out.print("feet = ");
        System.out.println(feet);
    }
}
