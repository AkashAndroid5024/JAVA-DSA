public class insertion_sort {
    public static void main(String[] args) {
        int a[]={5,4,1,3,2};
        insertionSort(a);
        print(a);
    }
    public static void insertionSort(int a[])
    {
        for(int i=1;i<a.length;i++)
        {
            int current =a[i];
            int prev=i-1;
            while(prev>=0 && a[prev]>current)
            {
                a[prev+1]=a[prev];
                prev--;
            }
            a[prev+1]=current;
        }
    }
    public static void print(int a[])
    {
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
        }
    }
    
}
