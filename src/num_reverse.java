// Program to print the reverse of a number
import java.util.Scanner;

public class num_reverse {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter a number");
         int num=sc.nextInt();
         int a=num;
         int c=0;
         while(a > 0)
         {
            int d = a%10;
            c=c*10+d; // to store the reverse of the number
            a=a/10;
         }
         System.out.println("Reverse of the number"+num+"is : "+c);
         sc.close();
    }
    
}
