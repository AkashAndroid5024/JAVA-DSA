//Program to make a income tax calculator using if else statement
import java.util.Scanner;

public class income_tax_calc {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter your income in whole number\n");
         int income=sc.nextInt();
         float tax=0.0f;
         if(income<500000)
         {
            tax=0.0f;
         }
         else if(income>=500000 && income < 1000000)
         {
            tax = income*0.20f;
         }
         else
         {
            tax = income*0.30f;
         }
         System.out.println("The tax for your income is :"+tax);
         sc.close();

    }
    
}
