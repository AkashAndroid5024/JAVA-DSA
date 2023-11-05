//Program to implement Linear Search
import java.util.Scanner;

public class linear_search {
    public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
            System.out.println("Enter the length of Array");
            int n = sc.nextInt();
            int arr[] = new int[n];
            System.out.println("Enter " + n + " elements");
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            System.out.println("Enter the element you want to search");
            int key =sc.nextInt();
            sc.close();
            
            int flag=-1;
            for (int i = 0; i < n; i++) 
            {
                if(arr[i]==key)
                {
                    flag=i;
                    break;
                }
            }
            if(flag!=-1)
            {
                System.out.println("Number found at index "+flag);
            }
            else{
                System.out.println("Number not found");
            }
	}
    
}
