// Program to print all the prime numbers in the range from 1 to num
import java.util.Scanner;

public class all_primes_in_range {
    
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter the range");
         int range =sc.nextInt();
         for(int i=2;i<=range;i++)
         {
             checkprime(i);
         }
         sc.close();
    }
    public static void checkprime(int num)
    {
        if(num==2)
        {
            System.out.print(num+" ");
            return;
        }
        for(int i=2;i<=Math.sqrt(num);i++)  // The loop is optimized in the Optimized Approach from thr Normal Approach
        {
            if(num%i==0)
            {
                return;
            }
        }
       System.out.print(num+" ");
}
}
