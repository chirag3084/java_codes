package prac;

import java.util.Scanner;

public class P6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character : ");
        char a = sc.next().charAt(0);
        if (a == 'A' || a == 'a' || a  == 'E' || a == 'e' || a == 'I' || a == 'i' || a == 'O' || a == 'o') {
            System.out.print("This is vowel");
        }
        else {
            System.out.print("This is consonent");
        }
    }
}
