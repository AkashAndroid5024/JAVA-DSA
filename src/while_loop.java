// Program to print numbers from 1 to n to show use of while loop
import java.util.Scanner;

public class while_loop {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter the range\n");
         int range=sc.nextInt();
         int counter=1;
         while(counter <= range)
         {
            System.out.print(counter+" ");
            counter++;
         }
         sc.close();
    }
    
}
