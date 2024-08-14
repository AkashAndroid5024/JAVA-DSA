public class backtracking_grid_ways {
    public static void main(String[] args) 
    {
        int n=4,m=4;
      System.out.println("Number of ways of reaching fron (0,0) to ("+(n-1)+","+(m-1)+") are "+gridways(0, 0, n, m)); 
    }
    public static int gridways(int i, int j, int n, int m)
    {
        //base case
        if(i==n-1 && j==m-1)
        {
            return 1;
        }
        else if(i==n || j==m) 
        {
            return 0;
        }
        //recursion
        int w1=gridways(i+1, j,n,m);
        int w2=gridways(i, j+1, n, m);
        return w1+w2;

    }
    
}
