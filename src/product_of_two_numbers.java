//Program to find the product of two numbers using function creation
import java.util.Scanner;

public class product_of_two_numbers {
    
    public static void main(String[] args) {
        {
             Scanner sc=new Scanner(System.in);
         System.out.println("Enter two numbers\n");
         int a=sc.nextInt();
         int b=sc.nextInt();
         product(a,b);
         sc.close();
        }
    }
    public static void product(int a, int b)
    {
        int prod = a*b;
        System.out.println(prod);
    }
    
}
