//Program to print the largest of three numbers

import java.util.Scanner;

public class largest_of_3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
         System.out.println("Enter three numbers\n");
         int a=sc.nextInt();
         int b=sc.nextInt();
         int c=sc.nextInt();
         if(a>=b &&a>=c)
         {
            System.out.println(+a+" is the largest");
         }
         else if(b >= c)
         {
            System.out.println(+b+" is the largest");
         }
         else
         {
            System.out.println(+c+" is the largest");
         }
    }
    
}
