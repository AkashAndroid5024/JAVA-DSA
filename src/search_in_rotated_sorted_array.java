/*
Enter the length of array
7
Enter 7 elements
4 5 6 7 0 1 2
Enter the number you want to search
1
Postion of targetted number is 5 
 */
import java.util.Scanner;

public class search_in_rotated_sorted_array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of array");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter "+n+" elements");
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
            
        }
        System.out.println("Enter the number you want to search");
        int num=sc.nextInt();
        int pos=search(a,num,0,a.length-1);
        System.out.println("Postion of targetted number is " +pos);
        sc.close();

    }
    public static int search(int a[], int target, int si, int ei)
    {
        int mid=si+(ei-si)/2;
        if(target==a[mid])
        {
            return mid;
        }
        if(a[si]<=a[mid])
        {
            if(a[si]<=target && target<=a[mid])
            {
                return search(a, target, si, mid-1);
            }
            else
            {
                return search(a, target, mid+1, ei);
            }

        }
        else
        {
            if(a[mid]<=target && target<=a[ei])
            {
                return search(a, target, mid+1, ei);
            }
            else
            {
                return search(a, target, si, mid-1);
            }
        }
    }
    
}
