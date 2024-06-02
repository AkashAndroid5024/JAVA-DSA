public class recursion_first_occurence {
    public static void main(String[] args) {
        int a[]={1,2,3,4,5,6,7,8,9,0,2,3,4,5,};
        int p=firstoccurence(a,0,5);
        System.out.println("Index is -1 if not found else a +ve integer :"+p);
    }
    public static int firstoccurence(int a[],int i,int key)
    {
        if(a[i]==a.length)
        {
            return -1;
        }
        if(a[i]==key)
        {
            return i;
        }
        return firstoccurence(a, i+1, key);
    }
    
}
