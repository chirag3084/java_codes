package prac;

import java.util.Scanner;

public class T3{

    public static void main(String[] args) {
        int a,i,n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number :  ");
        a = sc.nextInt();
        for(i=2;i<=a;i++){
            if(a%i==0){
                System.out.println(i);
                a = a /i;

            }

        }

    }

}
