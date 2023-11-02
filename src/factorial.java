//Program to find the factorial of a given number 
import java.util.Scanner;

public class factorial {
    
    public static void main(String[] args) {
        
             Scanner sc=new Scanner(System.in);
         System.out.println("Enter a number\n");
         int n=sc.nextInt();
          
          System.out.println("Factorial of "+n+" is : " +fact(n));
          sc.close();
        
    }
        public  static  int fact(int n)
        {
        
            int f=1;
            for(int i=1;i<=n;i++)
            {
                f*=i;
            }
            return f;

        }
    }

