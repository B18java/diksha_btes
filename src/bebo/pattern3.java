package bebo;
import java.util.Scanner;
public class pattern3 {
    public static void main(String[] args) {
        System.out.println("enter the rows");
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(int j=0;j<=n-i;j++)
            {
                System.out.print(" ");  
            }
            for(int k=0;k<=i-1;k++)
            {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}
