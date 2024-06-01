public class recursion_array_sorted_or_not {
    public static void main(String[] args) {
        
            int a[]={1,2,3,4,5,6,7,8,9,10};
            int b[]={1,2,3,4,5,6,7,8,91,10};
            System.out.println(issorted(a,0));
            System.out.println(issorted(b, 0));

        }
        public static boolean issorted(int a[],int i)
        {
            if(i==a.length-1)
            {
                return true;
            }
            if(a[i]>a[i+1])
            {
                return false;
            }
           return issorted(a, i+1);
        }
    
    
}
