import java.util.Scanner;
public class recursion_friends_pairing_problem 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of friends");
        int n=sc.nextInt();
        int p=pairing(n);  
        System.out.println("pairing: "+p);
        sc.close();  
    }  
    public static int pairing(int n)
    {
        if(n==1||n==2)
        {
            return n;
        }
        return pairing(n-1)+(n-1)*pairing(n-2);
    } 
    
    
}