import java.util.*;
public class bubble_sort_optimized {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements in the array");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter the elements of the array");
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        optimizedbubblesort(a);
        System.out.println("The sorted array is:");
        for(int i=0;i<n;i++)
        {
            System.out.print(a[i]+" ");
        }
        sc.close();

    }
    public static void optimizedbubblesort(int a[])
    {
        for(int i=0; i<a.length-1; i++)
        {
            boolean swapped=false;
            for(int j=0; j<a.length-1-i; j++)
            {
                if(a[j]>a[j+1])
                {
                    
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                    swapped=true;
                }
            }
            if(!swapped)
            {
                break;
            }
        
        }
    }
    
}
