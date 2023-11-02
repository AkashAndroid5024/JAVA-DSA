import java.util.Scanner;

public class call_by_value {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter two numbers\n");
         int a=sc.nextInt();
         int b=sc.nextInt();
         swap(a,b);   //Actual Parameters or Arguments
         System.out.println("Actual values of a and b are :"+a+" and "+b);
         System.out.println(" The values sent during the function call are the copies of the actual arguments. Therfore any changes made in the formal parameters does not reflect in the actual arguments");
         sc.close();
        
    }
    public static void swap(int a, int b)   // Formal Parameters
    {
        int temp =a;
        a = b;
        b = temp;
        System.out.println("Values after swapping are : "+a+" and "+b);
    }
    
}
