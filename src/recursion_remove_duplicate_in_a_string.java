import java.util.Scanner;
public class recursion_remove_duplicate_in_a_string 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string");
        String s=sc.nextLine();
        removeduplicate(s,0,new StringBuilder(""),new boolean[26]);  
        sc.close();  
    }    
    public static void removeduplicate(String s,int idx,StringBuilder str, boolean map[])
    {
        if(idx==s.length())
        {
            System.out.println(str);
            return;
        }
        char curr=s.charAt(idx);
        if(map[curr-'a']==true)
        {
            removeduplicate(s, idx+1, str, map);
        }
        else
        {
            map[curr-'a']=true;
            removeduplicate(s, idx+1, str.append(curr), map);
        }
    }
}
