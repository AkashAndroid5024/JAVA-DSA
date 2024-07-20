import java.util.Scanner;

public class quick_sort {
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
        quicksort(a, 0, a.length-1);
        print(a);
        sc.close();
    
    }
    public static void quicksort(int a[], int si, int ei)
    {
        if(si>ei)
        {
            return;
        }
        int pIdx=partition(a, si, ei);
        quicksort(a, si, pIdx-1);
        quicksort(a, pIdx+1, ei);
    }
    public static int partition(int a[],int si,int ei)
    {
        int pivot=a[ei];
        int i=si-1;
        for(int j=si;j<ei;j++)
        {
            if(a[j]<=pivot)
            {
                i++;
                int temp=a[j];
                a[j]=a[i];
                a[i]=temp;
            }

        }
        i++;
        int temp=pivot;
        a[ei]=a[i];
        a[i]=temp;
        return i;   
     }
     public static void print(int a[])
     {
         for(int i=0;i<a.length;i++)
         {
             System.out.println(a[i]);
         }
     }
}
