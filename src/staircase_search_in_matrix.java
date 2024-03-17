import java.util.Scanner;

public class staircase_search_in_matrix {
    
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
        System.out.println("Enter the number to be searched");
        int key=sc.nextInt();
        stairCase(a,key);
        sc.close();
    }
    public static boolean stairCase(int a[][],int key)   // Time complexity is O(n+m)
    {
        int row=0, col=a[0].length-1;
        while(row<a.length && col>=0)
        {
            if(a[row][col]==key)
            {
                System.out.println("Element found at ("+row+","+col+")");
                return true;
            }
            else if(key<a[row][col])
            {
                col--;
            }
            else
            {
                row++;
            }
            
            
        }
        System.out.println("Key not found");
        return false;
    }

}
