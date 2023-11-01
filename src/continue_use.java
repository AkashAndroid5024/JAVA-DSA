//Program to display all numbers entered by user except multiples of 10
import java.util.Scanner;

public class continue_use {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         do{
            System.out.println("Enter a number");
            int a = sc.nextInt();
            if(a % 10 == 0)
            {
                continue;
            }
            System.out.println("Your number was: "+a);
         }while(true);
         
    }

    
}
