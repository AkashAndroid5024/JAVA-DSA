/* Program to print the solid rhombus pattern :
for n=10(number of rows)
                   * * * * * * * * * *
                * * * * * * * * * *
              * * * * * * * * * *
            * * * * * * * * * *
          * * * * * * * * * *
        * * * * * * * * * *
      * * * * * * * * * *
    * * * * * * * * * *
  * * * * * * * * * *
* * * * * * * * * *
                            */
import java.util.Scanner;
public class solid_rhombus_pattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int n=sc.nextInt();
        
        
        for(int i=1;i<=n;i++)
            {
                for(int j=1;j<=(2*n-1);j++)
                {
                    if(j<=(n-i) || j>2*n-i)
                    {
                        System.out.print("  ");
                    }
                    else {
                        System.out.print("* ");
                    }
                    
                }
                System.out.println();
            }
    
}
}
