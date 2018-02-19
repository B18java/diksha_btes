package bebo;
import java.util.Scanner;
public class swap {
    public static void main(String[] args) {
        int x,y,temp;
        System.out.println("Enter values of x and y");
        Scanner s=new Scanner(System.in);
        x=s.nextInt();
        y=s.nextInt();
        System.out.println("before swapping x= "+x+" y="+y);
        temp=x;
        x=y;
        y=temp;
        System.out.println("after swapping x= "+x+" y="+y);
    }
    
}
