public class selection_sort {
    public static void main(String[] args) {
        int a[]={5,4,1,3,2};
        selectionSort(a);
        print(a);
    }
    public static void selectionSort(int a[])
    {
        for(int i=0;i<a.length-1;i++)
        {

            int minpos=i;
            for(int j=i+1;j<a.length;j++)
            {
                if(a[minpos]>a[j])
                {
                    minpos=j;
                }
                int temp=a[minpos];
                a[minpos]=a[i];
                a[i]=temp;
            }
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
