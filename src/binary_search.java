// Program to implement Binary Search
import java.util.Scanner;

public class binary_search 
{
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
            System.out.println("Enter the element you want to search");
            int key =sc.nextInt();
            sc.close();
            int l,h,m,c=-1;
            l=0;
            h=n-1;
            while(l<=h)
            {
                 m=(l+h)/2;
                if(arr[m]==key)
                {
                    c=m;
                    System.out.println("Number found at index position :"+c);
                    break;
                }
                if(key<arr[m])
                {
                    h=m-1;
                }
                if(key>arr[m])
                {
                    l=m+1;
                }
            }
            if(c==-1)
            System.out.println("Number not found in the list");
        }
    
}
