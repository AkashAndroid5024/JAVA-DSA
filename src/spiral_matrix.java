/*Enter the no. of rows and columns of the matrix
4
4
Enter 16elements
1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16
1 2 3 4 8 12 16 15 14 13 9 5 6 7 11 10 */
import java.util.*;
public class spiral_matrix {
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
        spiralMatrix(a);
        sc.close();
    }
    public static void spiralMatrix(int a[][])
    {
        int startrow=0;
        int startcol=0;
        int endrow=a.length-1;
        int endcol=a[0].length-1;
        while(startrow<=endrow && startcol<=endcol)
        {
            for(int j=startcol;j<=endcol;j++)
            {
                System.out.print(a[startrow][j]+" ");

            }
            for(int k=startrow+1;k<=endrow;k++)
            {
                System.out.print(a[k][endcol]+" ");
            }
            for(int x=endcol-1;x>=startcol;x--)
            {
                if(startrow==endrow)
                {
                    break;
                }
                System.out.print(a[endrow][x]+" ");
            }
            for(int y=endrow-1;y>=startrow+1;y--)
            {
                if(startcol==endcol)
                {
                    break;
                }
                System.out.print(a[y][startcol]+" ");

            }
            startcol++;
            startrow++;
            endcol--;
            endrow--;
            

        }
    }
    
}
