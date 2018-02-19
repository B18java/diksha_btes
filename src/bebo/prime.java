
package bebo;
import java.util.Scanner;
public class prime {
    public static void main(String[] args) {
    int temp,flag=0,i,num;
    System.out.println("enter the number ");
  Scanner s=new Scanner(System.in);
  num=s.nextInt();
  for(i=2;i<=num/2;i++)
  {
      temp=num%i;
      if(temp==0)
      {
          flag=1;
          break;
      }
    
  }
  if(flag==0)
  {
      System.out.println("number is prime");
  }
  else
  {
      System.out.println("number is not prime");
  }
}
}