/*     Program to print the square pattern :

* * * * * * * * * * * * * * * 
*                           *
*                           *
*                           *
*                           *
*                           *
*                           *
* * * * * * * * * * * * * * *   
            
    */
public class hollow_rectangle {
    
        public static void main(String[] args) {
            for(int i=0;i<8;i++)
            {
                for(int j=0;j<15;j++)
                {
                    if(i==0 || j==0 || i==7 || j==14)
                    {
                    System.out.print("* ");
                    }
                    else{
                        System.out.print("  ");
                    }
                }
                System.out.println();
            }
        }
        
    }
    
    

