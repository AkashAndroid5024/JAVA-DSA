import java.util.*;
public class diagonal_sum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no. of rows and columns of the matrix");
        int m=sc.nextInt();
        int n=sc.nextInt();
        int a[][]=new int[m][n];
        System.out.println("Enter "+m*n+"elements");
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a[0].length;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
        diagonalSum(a);
        optimizeddiagonalSum(a);
        sc.close();
    }
    public static void diagonalSum(int a[][]) //BruteForce approach  complexity :O(n^2)
    {
        int d1=0,d2=0;
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a[0].length;j++)
            {
                if(i==j)
                {
                    d1+=a[i][j];
                }
                else if(i+j==a.length-1)
                {
                    d2+=a[i][j];
                }
            }
        }
        System.out.println(d1+d2);

    }
    public static void optimizeddiagonalSum(int a[][])  //Optimized approach O(n) linear time complexity
    {
        int d1=0,d2=0;
        for(int i=0;i<a.length;i++)
        {
            d1+=a[i][i];
            if(i!=a.length-1-i)
            {
                d2+=a[i][a.length-1-i];
            }
        }
        System.out.println(d1+d2);
    }
    
    
}
