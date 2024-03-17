public class counting_sort {
    public static void main(String[] args) {
        int a[]={1,4,1,3,2,4,3,7};
        countingSort(a);
       
    }
    public static void countingSort(int a[])
    {
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<a.length;i++)
        {
            largest=Math.max(largest,a[i]);
        }
        int count[]=new int [largest+1];
        for(int i=0;i<=largest;i++)
        {
            count[a[i]]+=1;
        }
        for(int i=1;i<=largest;i++)
        {
            count[i]=count[i]+count[i-1];
        }
        int b[]=new int [a.length];
        for(int i=a.length-1;i>=0;i--)
        {
            b[count[a[i]]-1]=a[i];
            count[a[i]]--;
        }
    
        for(int i=0;i<b.length;i++)
        {
            System.out.print(b[i]+" ");
        }
}
    
}
