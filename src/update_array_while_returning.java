public class update_array_while_returning {
    public static void main(String[] args) {
        int a[]=new int[5];
        updatearray(a,0,1);
        printarray(a);
    }
    public static void updatearray(int a[],int i,int val)
    {
        if(i==a.length)
        {
            printarray(a);
            return;
        }
        a[i]=val;
        updatearray(a, i+1, val+1);
        a[i]=a[i]-2;
    }
    public static void printarray(int a[])
    {
        for(int i=0;i<a.length;i++)
        {
            System.out.println(a[i]);
        }
    }

    
}
