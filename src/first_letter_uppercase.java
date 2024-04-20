/*Output:
Enter the Sentence
hi, my name is akash. How are You
Hi, My Name Is Akash. How Are You
 */
import java.util.*;;
public class first_letter_uppercase {
    public static void main(String[] args) {
        
    
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Sentence");
        String s=sc.nextLine();
        System.out.println(Uppercase(s));
        sc.close();
    }
    public static String Uppercase(String s)
    {
        StringBuilder sb=new StringBuilder();
        char ch=Character.toUpperCase(s.charAt(0));
        sb.append(ch);
        for(int i=1;i<s.length();i++)
        {
            if(s.charAt(i)==' ' && i<s.length()-1)
            {
                sb.append(s.charAt(i));
                i++;
                sb.append(Character.toUpperCase(s.charAt(i)));
            }
            else{
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }
    
}
