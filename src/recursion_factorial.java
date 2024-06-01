import java.util.*;
public class recursion_factorial {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number to find it's factorial");
        int n=sc.nextInt();
        int f=fact(n);
        System.out.println("Factorial of "+n+" is "+f);
        sc.close();
    }
    public static int fact(int n)
    {
        if(n==0)
        {
            return 1;
        }
        return n*fact(n-1);
    }
    
}
