// Program to Reverse An Array
import java.util.Scanner;

public class reverse_an_array {
    public static void main(String[] args)
    {
        
    
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the length of Array");
            int n = sc.nextInt();
            int arr[] = new int[n];
            System.out.println("Enter " + n + " elements");
            for (int i = 0; i < n; i++) 
            {
                arr[i] = sc.nextInt();
            }
            
            reverse(arr);
            System.out.println("Reversed Array is :");
            for (int i = 0; i < n; i++) 
            {
               System.out.println(arr[i]);
            }
            sc.close();       

    }
    public static void reverse(int arr[])
    {
        int first = 0, last = arr.length-1;
            while(first<last)
            {
                int temp=arr[first];
                arr[first]=arr[last];
                arr[last]=temp;
                first++;
                last--;
            }
    }
    
}
