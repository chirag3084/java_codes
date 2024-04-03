package prac;

public class 1 {
    public static void main(String[] args){
        char a,b,c;
        int i;
        for(a = 'A';a<='Z';++a){
            for(b='A';b<='Z';++b){
                for(i=0;i<=9999;++i)
                {
                 String s = String.format("%c%c%c%04d",a,b);
                    System.out.println(s);
                }
            }
        }
        //System.out.println();
    }
}
