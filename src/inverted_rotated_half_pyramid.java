/*  Program to print the following pattern :
                  * 
                * * 
              * * * 
            * * * * 
          * * * * * 
        * * * * * * 
      * * * * * * *
    * * * * * * * *
  * * * * * * * * * 
* * * * * * * * * *
                                    */
public class inverted_rotated_half_pyramid {
    public static void main(String[] args) {
        for(int i=1;i<=10;i++)
        {
            for(int j=1;j<=10;j++)
            {
                if(i+j>10)
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

    

