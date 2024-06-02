public class recursion_last_occurence {
    public static void main(String[] args) {
        int a[]={1,2,3,4,5,6,7,8,9,0,2,3,4,5,};
        int p=lastoccurence(a,0,5);
        System.out.println("Index is -1 if not found else a +ve integer :"+p);
    }
    public static int lastoccurence(int a[],int i,int key)
    {
        if(i==a.length)
        {
            return -1;
        }
        int isfound=lastoccurence(a, i+1, key);
        if(isfound==-1 && a[i]==key)
        {
            return i;
        }
        return isfound;
    }
}
