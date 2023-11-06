/*Program to implement Kadanes Algorithm :
Time Complexity is Big O(n)
Example Output :
Enter the number of elements in the array
8
Enter 8 elements
-2
-3
4
-1
-2
1
5
-3
MAximun Sum in the subarray is : 7
 */
import java.util.Scanner;

public class kadanes_algorithm {
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
        kadanesalgo(arr);
    }
    public static void kadanesalgo(int arr[])
    {
        int maxsum=Integer.MIN_VALUE;
        int currentSum=0;
        for(int i=0;i<arr.length;i++)
        {
            currentSum+=arr[i];
            if(currentSum<0)
            {
                currentSum=0;
            }
            maxsum=Math.max(maxsum, currentSum);
        }
        System.out.println("MAximun Sum in the subarray is : "+maxsum);
    }
    
}
