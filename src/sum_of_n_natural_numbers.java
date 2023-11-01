// Program to find the Sum of first n natural mnumbers
import java.util.Scanner;

public class sum_of_n_natural_numbers {
    public static void main(String[] args) {
        {
             Scanner sc=new Scanner(System.in);
         System.out.println("Enter the range\n");
         int n=sc.nextInt();
         int sum = 0;
         int counter = 0;
         while(counter <= n)
         {
            sum += counter;
            counter++;
         }
         System.out.println("Sum of first n natural mnumbers is : "+sum);

        }
    }
    
}
