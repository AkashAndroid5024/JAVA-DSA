//Program to check whether a number is even or odd
import java.util.Scanner;

public class even_or_odd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
         System.out.println("Enter a number\n");
         int a=sc.nextInt();
         if(a%2==0)
         {
            System.out.println(+a+" is even number");
         }
         else
         {
            System.out.println(+a+" is odd number");
         }
    }
    
}
