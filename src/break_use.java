// Program to keep entering numbers till the user enter's multiple of 10
import java.util.Scanner;

public class break_use {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         do{
            System.out.println("Enter a number");
            int a =sc.nextInt();
            if(a % 10 == 0)
            {
                break;
            }
            System.out.println("Your number was :"+a);
         }while(true);
         sc.close();
         
    }
    
}
