import java.util.*;
public class string_compression {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String");
        String s=sc.next();
        System.out.println(compress(s));
        sc.close();
    }
    public static String compress(String s)
    {
        String new_s="";
        for(int i=0;i<s.length();i++)
        {
            Integer count=1;
            while(i<s.length()-1 && s.charAt(i)==s.charAt(i+1))
            {
                count++;
                i++;
            }
            new_s+=s.charAt(i);
            if(count>1)
            {
                new_s+=count.toString();
            }
            
        }
        return new_s;
    }
}
