import java.util.Scanner;

public class aritmetic_operators {
    
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter two numbers\n");
         int a=sc.nextInt();
         int b=sc.nextInt();
         System.out.println("Addition is "+(a+b));
         System.out.println("Multiplication is "+(a*b));
         System.out.println("Subtraction is "+(a-b));
         System.out.println("Division is "+(a/b));
         System.out.println("Modulus is "+(a%b));
         System.out.println("Prefix increment is "+(++a));
         System.out.println("Prefix decrement is "+(--a));
         System.out.println("Postfix increment is "+(a++));
         System.out.println("Postfix decrement is "+(a--));
         System.out.println("Value of a is "+a);
    }
}
