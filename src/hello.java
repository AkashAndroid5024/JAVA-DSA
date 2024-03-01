import java.util.*;
public class hello {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        System.out.println(n);
        System.out.println(num(n));
        
    }
    public static int num(int n)
    {
        int c=n*n;
        return c;
    }
}
