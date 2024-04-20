import java.util.*;
public class palindrome_string {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string");
        String s=sc.nextLine();
        System.out.println(palstring(s));
        sc.close();
    }
    public static boolean palstring(String s)
    {
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)!=s.charAt(s.length()-1-i))
            {
                return false;
            }
           
        }
        return true;

    }

    
}
