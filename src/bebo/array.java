
package bebo;
    import java.util.Scanner;

public class array {

    public static void main(String[] args) {
        int i,j;
        Scanner s=new Scanner(System.in);
       
        System.out.println("Enter the number of rows");
        int r=s.nextInt();//3
        System.out.println("Enter the number of cols for each row");
        int c=s.nextInt();//4
        int [][] arr=new int[3][];
        arr[0]=new int[3];
        arr[1]=new int[2];
        arr[2]=new int[5];
        
        for(i=0;i<arr.length;i++)
         {
          System.out.println("Enter the size for "+(i+1)+"row");
          int n=s.nextInt();
          arr[i]=new int[n];
          }
         for(i=0;i<arr.length;i++)
        {
            for(j=0;j<arr[i].length;j++)
            {
                arr[i][j]=s.nextInt();
            }
        }
        for(i=0;i<arr.length;i++)
        {
            for(j=0;j<arr[i].length;j++)
            {
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
        }
    }

}

    
    
    