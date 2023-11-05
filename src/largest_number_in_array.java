// Program to find the largest number in a given Array
import java.util.Scanner;

public class largest_number_in_array {
    public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
            System.out.println("Enter the length of Array");
            int n = sc.nextInt();
            int arr[] = new int[n];
            System.out.println("Enter " + n + " elements");
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            sc.close();
            
            int max=0;
            for (int i = 0; i < n; i++) 
            {
                if(arr[i]>max)
                {
                    max=arr[i];
                    
                }
            }
            System.out.println("Largest number in the array is : "+max);
    
}
}
