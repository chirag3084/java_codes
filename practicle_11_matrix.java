import javax.imageio.stream.ImageInputStream;
import java.util.*;
public class practicle_11_matrix {

    public static int gcd(int num1, int num2){
        int gcd = 1;
        for(int i=1;i<num1 && i<num2;++i){
            if(num1 % i == 0 && num2 % i == 0){
                gcd = i;
            }
        }
        return gcd;
    }

    public static void main(String[] args) {
        int num1,num2;
        Scanner sc = new Scanner(System.in);
        practicle_11_matrix p1 = new practicle_11_matrix();
        System.out.println("enter the number 1:");
         num1 = sc.nextInt();
        System.out.println("enter the number 2:");
         num2 = sc.nextInt();
         int ans = p1.gcd(num1,num2);
        System.out.println(num1+" and "+num2+" gcd is: "+ans);
    }
}