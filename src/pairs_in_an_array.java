// Program to print all pairs in an Array
import java.util.Scanner;

public class pairs_in_an_array {
            public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the length of Array");
            int n = sc.nextInt();
            int arr[] = new int[n];
            System.out.println("Enter " + n + " elements");
            for (int i = 0; i < n; i++) 
            {
                arr[i] = sc.nextInt();
            }
            sc.close();
            System.out.println("All the pairs are : ");
            for(int i=0;i<n;i++)
            {
                for(int j=i+1;j<n;j++)
                {
                    System.out.print("("+arr[i]+","+arr[j]+")  ");
                }
                System.out.println();
            }
    }
    
}
