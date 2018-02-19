
package bebo;
import java.util.Scanner;
public class reverse {
    public static void main(String[] args) {
        int num,rev=0,rem;
        System.out.println("enter the number to be reversed");
        Scanner s=new Scanner(System.in);
        num=s.nextInt();
        while(num!=0)
        {
            rem=num%10;
            rev=rev*10+rem;
            num=num/10;
        }
        System.out.println("reversed number is"+rev);
    }
}
