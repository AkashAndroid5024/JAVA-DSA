/*Program to print the following palindromic pattern:
           1
          2 1 2
        3 2 1 2 3
      4 3 2 1 2 3 4
    5 4 3 2 1 2 3 4 5
  6 5 4 3 2 1 2 3 4 5 6
7 6 5 4 3 2 1 2 3 4 5 6 7

*/
import java.util.Scanner;
public class palindromic_pattern {
     public static void main(String[] args) {


    Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++)
    {
        for(int j=1;j<=n-i;j++)
        {
            System.out.print("  ");
        }
        for(int k=i;k>=1;k--)
        {
            System.out.print(k+" ");

        }
        for(int k=2;k<=i;k++)
        {
            System.out.print(k+" ");
        }
        System.out.println();
    }
}
    
}
