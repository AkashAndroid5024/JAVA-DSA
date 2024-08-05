import java.util.*;
public class backtracking_print_all_subsets_of_given_string {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string");
        String s=sc.nextLine();
        printsubsets(s,"",0);
        sc.close();
    }
    public static void printsubsets(String s, String ans, int i)
    {
        //Base Case
        if(i==s.length())
        {
            if(ans.length()==0)
            {
                System.out.println("NULL");
            }
            else{
            System.out.println(ans);
            }
            return;
        }
        // If character want to be in the ans  (YES CASE)
        printsubsets(s, ans+s.charAt(i), i+1);
        // If character doesnt want to be in the ans (NO CASE)
        printsubsets(s, ans, i+1);
    }
    
}
