import java.util.*;
public class recursion_nth_fibonacci {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the nth fibonacci term");
        int n=sc.nextInt();
        int p=fibo(n);
        System.out.println(n+"th fibonacci number is: "+p);
        sc.close();
    }
    public static int fibo(int n)
    {
        if(n==0 ||n==1)
        {
            return n;
        }
        return fibo(n-1)+fibo(n-2);

    }

}
