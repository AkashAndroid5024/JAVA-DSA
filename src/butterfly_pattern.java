/* Program to print the followu=ing butterfly pattern :

*             * 
* *         * *
* * *     * * *
* * * * * * * *
* * * * * * * *
* * *     * * *
* *         * *
*             *
                    */
public class butterfly_pattern {
    public static void main(String[] args) {
        
        
        for(int i=1;i<=4;i++)
            {
                for(int j=1;j<=8;j++)
                {
                    if(j<=i||j>(8-2*i)+i)
                    {
                        System.out.print("* ");
                    }
                    else {
                        System.out.print("  ");
                    }
                    
                }
                System.out.println();
            }
            for(int i=4;i>=1;i--)
            {
                for(int j=1;j<=8;j++)
                {
                    if(j<=i||j>(8-2*i)+i)
                    {
                        System.out.print("* ");
                    }
                    else {
                        System.out.print("  ");
                    }
                    
                }
                System.out.println();
            }
        }
    
}
