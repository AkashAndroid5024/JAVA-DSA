//Program to check whether a number is prime or not.
import java.util.Scanner;
public class prime_number {
    public static void main(String[] args) {
       
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter a number");
            int num = sc.nextInt();
            System.out.println("Function primecheck() is a normal approach to check prime");
            boolean isPrime = primecheck(num);
            if(isPrime==true)
            {
                System.out.println("Number is Prime");
            }
            else{
                System.out.println("Number is not Prime");
            }
            System.out.println("Function optimizedPrimeCheck() is an optimized approach to check prime ");
            boolean isprime = optimizedPrimeCheck(num); 
            if(isprime==true)
            {
                System.out.println("Number is Prime");
            }
            else{
                System.out.println("Number is not Prime");
            }
            sc.close();
            
        

    }
    public static boolean primecheck( int num)
    {
        if(num==2)
        {
            return true;
        }
        for(int i=2;i<num;i++)
        {
            if(num%i==0)
            {
                return false;
            }
        }
        
        return true;
    }
    public static boolean optimizedPrimeCheck(int num)
    {
        if(num==2)
        {
            return true;
        }
        for(int i=2;i<=Math.sqrt(num);i++)  // The loop is optimized in the Optimized Approach from thr Normal Approach
        {
            if(num%i==0)
            {
                return false;
            }
        }
        return true;
    }
}
    

