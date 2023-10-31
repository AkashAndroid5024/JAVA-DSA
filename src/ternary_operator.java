//Program to check whether a number is even or odd using ternary operator
import java.util.Scanner;

public class ternary_operator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
         System.out.println("Enter a number\n");
         int a=sc.nextInt();
         String type = ((a%2)==0)?"Even":"Odd";
         System.out.println(type);
         sc.close();
    }
    
}
