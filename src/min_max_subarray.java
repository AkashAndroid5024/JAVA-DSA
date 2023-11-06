/*Program to print the minimum and maximum sum of subarrays
 example output :
Enter the number of elements in the array
5
Enter 5 elements
1
-2
6
-1
3
Maximum sum of subarray is :8
Minimum sum of subarray is :-2
 */
import java.util.Scanner;

public class min_max_subarray 
{
     public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements in the array");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter "+n+" elements");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        sc.close();
        int max=0;
        int min=arr[0];
        for(int i=0;i<n;i++)
        {
            
            for(int j=i;j<n;j++)
            {
                int sum=0;
                for(int k=i;k<=j;k++)
                {
                    sum+=arr[k];
                    
                }
                if(sum>=max)
                {
                    max=sum;
                }
                if(sum<min)
                {
                    min=sum;   
                }
            }
            
           
        }
        System.out.println("Maximum sum of subarray is :"+max);
        System.out.println("Minimum sum of subarray is :"+min);
    }   
}
