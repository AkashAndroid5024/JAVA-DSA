/*Program to print all the subarrays:
 example: output:
Enter the number of elements in the array
5
Enter 5 elements
2
4
6
8
10
[2 ][2 4 ][2 4 6 ][2 4 6 8 ][2 4 6 8 10 ]
[4 ][4 6 ][4 6 8 ][4 6 8 10 ]
[6 ][6 8 ][6 8 10 ]
[8 ][8 10 ]
[10 ]
 */
import java.util.Scanner;
public class print_all_subarrays
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
        for(int i=0;i<n;i++)
        {
            
            for(int j=i;j<n;j++)
            {
                System.out.print("[");
                for(int k=i;k<=j;k++)
                {
                    System.out.print(arr[k]+" ");
                }
                System.out.print("]");
            }
            
            System.out.println();
        }
    }
}