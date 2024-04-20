import java.util.*;
public class largest_string {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of strings");
        int n=sc.nextInt();
        System.out.println("enter "+n+" Strings");
        String a[]=new String[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.next();
        }
        
        System.out.println(largestString(a));
        sc.close();
    }
    public static String largestString(String s[])
    {
        String large=s[0];
        for(int i=1;i<s.length;i++)
        {
            if(large.compareTo(s[1])<0)
            {
                large=s[1];
            }
        }
        return large;

    }
    
}
