/* Program to print the following pattern:
   * 
   *  *
   *  *  *
   *  *  *  *
   
 */
public class reverse_triangle {
    public static void main(String[] args) {
        for(int i=1;i<=4;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("* ");
            }
           System.out.println();
        }
    }
    
}
