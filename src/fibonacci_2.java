import java.util.Scanner;

public class fibonacci_2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the term which you want");
        int n=sc.nextInt();
        System.out.println(fibonacciNumber(n));
        sc.close();

    }
    public static int fibonacciNumber(int n){
        // Write your code here.
        long res = (long)1e9+7;
       
         long prev=0;
         long curr=1;
         
         for(long i=2;i<=n;i++)
         {
             long pre=curr;
             
             curr=(curr+prev)%res;
             prev=pre;
             
             
         }
         return (int)curr;
    }
    
}
