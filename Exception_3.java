import java.util.Scanner;

public class Exception_3
{
     public static void main(String[] args)
     {
          int n,i;
          Scanner in = new Scanner(System.in);
          System.out.println("enter how many students");
          n=in.nextInt();
          int m[] = new int[n];
          for(i=0;i<n;i++)
          {
            System.out.print("Enter "+(i+1)+" student marks:");

            m[i]=in.nextInt();
            if(m[i]>100||m[i]<0)
            throw new ArithmeticException("mark is not valid");
          }
     }
}
