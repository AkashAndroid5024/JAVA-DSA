//Program to check whether a student will pass or fail according to marks obtained: (MARKS>=33)-->PASS else FAIL using ternary operator 
import java.util.Scanner;

public class ternary_operator1 {
    


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
         System.out.println("Enter your marks\n");
         int marks=sc.nextInt();
         String result = (marks>=33)?"PASS":"FAIL";
         System.out.println(result);
         sc.close();
    }
    
}

    

