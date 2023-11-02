// Program to find the binomial coefficient of nCr
import java.util.Scanner;

public class binomial_coefficient {
    public static void main(String[] args) {
        
            Scanner sc=new Scanner(System.in);
         System.out.println("Enter the n and r in nCr \n");
         int n=sc.nextInt();
         int r=sc.nextInt();
         int fn=fact(n);
         int fr=fact(r);
         int fnmr=fact(n-r);
          int bino_coefficient=fn/(fr*fnmr);
          System.out.println("Binomial Coefficient of "+n+"C"+r+" is : " +bino_coefficient);
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
    
    

