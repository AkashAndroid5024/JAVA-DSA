/*Program to calculate the maximum sum in the given subarray by prefix sum approach :
example output:
Enter the number of elements in the array
5
Enter 5 elements
1
-2
6
-1
3
Maximum sum of subarray is : 8
 */
import java.util.Scanner;

public class max_sum_subarray_prefix_sum_approach 
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
        int currentsum=0,max=0;
        int prefix[]=new int [n];
        prefix[0]=arr[0];
        sc.close(); 
        //Calculate prefix
        for(int i=1;i<n;i++)
        {
            prefix[i]=prefix[i-1]+arr[i];
        }  
        for(int i=0;i<n;i++)
        {
           int start=i;     
           for(int j=1;j<n;j++)
            {
                int end=j;
                currentsum = start == 0 ? prefix[end]: prefix[end] - prefix[start-1] ;
                
                if(max<currentsum)
                {
                    max=currentsum;
                }
            }
        }
        System.out.println("Maximum sum of subarray is : "+max);
    }
}
