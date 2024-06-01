import java.util.*;
/**
 * recursion_n_to_1
 */
public class recursion_n_to_1 {

     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        nto1(n);
        sc.close();
     }
     public static void nto1(int n)
     {
        if(n==0)
        {
            return;
        }
        System.out.println(n);
        nto1(n-1);
     }
}