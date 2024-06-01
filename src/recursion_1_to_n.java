import java.util.Scanner;

public class recursion_1_to_n 
{
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        ton(n);
        sc.close();
    }
    public static void ton(int n)
    {
        if(n==0)
        {
            return;
        }
        ton(n-1);
        System.out.println(n);
        return;
    }
    
}
    

