import java.util.*;
public class shortest_path {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Directiions");
        String s=sc.next();
        System.out.println(shortestpath(s));
        sc.close();
    }
    public static float shortestpath(String s)
    {
        int x=0,y=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='N')
            {
                y++;
            }
            if(s.charAt(i)=='S')
            {
                y--;
            }
            if(s.charAt(i)=='E')
            {
                x++;
            }
            if(s.charAt(i)=='W')
            {
                x--;
            }
        }
        int X1=x*x;
        int Y1=y*y;
        return (float)Math.sqrt(X1+Y1);
    }
    
}
