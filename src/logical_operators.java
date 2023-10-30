import java.util.Scanner;

public class logical_operators {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter two numbers\n");
         int a=sc.nextInt();
         int b=sc.nextInt();
         System.out.println("Logical AND of a>b&&b>a is "+((a>b)&&(b>a)));
         System.out.println("Logical OR of a>b||b>a is "+((a>b)||(b>a)));
         System.out.println("Logical NOT of a>b is "+(!(a>b)));

    }
    
}
