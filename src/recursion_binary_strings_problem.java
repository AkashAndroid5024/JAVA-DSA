import java.util.Scanner;
public class recursion_binary_strings_problem
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of binary");
        int n=sc.nextInt();
        binary(n,0,"");  
        
        sc.close();  
    }  
    public static void binary(int n,int lp,String s)
    {
        if(n==0)
        {
            System.out.println(s);
            return;
        }
        binary(n-1, 0, s+"0");
        if(lp==0)
        {
            binary(n-1, 1, s+"1");
        }

    }
}