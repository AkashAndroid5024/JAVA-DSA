import java.util.*;
public class recursion_tiling_problem {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of n in 2xn floor size");
        int n=sc.nextInt();
        int cost=floortiling(n);
        System.out.println("The cost of tiling  is: "+cost);
        sc.close();
    }
    public static int floortiling(int n)
    {
        if(n==0 || n==1)
        {
            return 1;
        }
        int fnm1=floortiling(n-1);
        int fnm2=floortiling(n-2);
        int totalways=fnm1+fnm2;
        return totalways;
    }
    
}
