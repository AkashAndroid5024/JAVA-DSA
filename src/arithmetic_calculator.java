//Program to demonstrate a basic calculator using switch case when two inputs are taken
import java.util.Scanner;
public class arithmetic_calculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two numbers\n");
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("Enter the operation you would like to perform + , -, * , / , %");
        char operation =sc.next().charAt(0);
        switch(operation)
        {
            case '+':
            System.out.println(a+b);
            break;
            case '-':
            System.out.println(a-b);
            break;
            case '*':
            System.out.println(a*b);
            break;
            case '/':
            System.out.println(a/b);
            break;
            case '%':
            System.out.println(a%b);
            break;
            default:
            System.out.println("Enter corect choice");
        }
        sc.close();

    }
    
}
