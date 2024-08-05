import java.util.*;
public class all_permutations_of_a_given_string {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String");
        String s=sc.nextLine();
        sc.close();
        permutestring(s,"");
    }    
    public static void permutestring(String s,String ans)
    {
        //Base Case
        if(s.length()==0)
        {
            System.out.println(ans);
            return;
        }
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            String ns=s.substring(0, i)+s.substring(i+1);
            permutestring(ns, ans+c);
        }
    }
}
