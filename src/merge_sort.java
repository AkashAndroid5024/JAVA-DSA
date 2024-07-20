import java.util.*;
public class merge_sort {
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
        mergesort(a, 0, a.length-1);
        print(a);
        sc.close();
        
    }
    public static void mergesort(int a[],int si,int ei)
    {
        if(si>=ei)
        {
            return;
        }
        int mid=si+(ei-si)/2;
        mergesort(a,si,mid);
        mergesort(a,mid+1,ei);
        merge(a,si,mid,ei);
    }
    public static void merge(int a[], int si, int mid, int ei)
    {
        int temp[]=new int[ei-si+1];
        int i=si;
        int j=mid+1;
        int k=0;
        while(i<=mid && j<=ei)
        {
            if(a[i]<a[j])
            {
                temp[k]=a[i];
                i++;
            }
            else{
                temp[k]=a[j];
                j++;
            }
            k++;
        }
        while(i<=mid)
        {
            temp[k++]=a[i++];
        }
        while(j<=ei)
        {
            temp[k++]=a[j++];
        }
        for(k=0,i=si;k<temp.length;k++,i++)
        {
            a[i]=temp[k];
        }
    }
    public static void print(int a[])
    {
        for(int i=0;i<a.length;i++)
        {
            System.out.println(a[i]);
        }
    }


    
}
