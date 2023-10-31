//Program to print the largest of two numbers by using if else statement
import java.util.Scanner;

public class largest_of_two {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter two numbers\n");
         int a=sc.nextInt();
         int b=sc.nextInt();
         if(a>b)
         {
            System.out.println(+a +" is the largest of two numbers");
         }
         else
         {
             System.out.println(+b +" is the largest of two numbers");
         }
    
}
    
}
