import java.util.*;
public class Decimalbase {
    public static   String  Db(int a,int b) {

        String finl=" ";
        while(a!=0) {

            int temp=a%b;
            finl=temp+finl;
            a=a/b;
        }
        return finl.toString();
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        Db(a,b);
        System.out.println(Db(a,b));
    }
}