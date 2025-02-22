import java.util.ArrayList;
import java.util.Arrays;

public class contains_most_water_ArrayList {
    public static void main(String args[])
    {
        ArrayList<Integer> height=new ArrayList<>();
        height.addAll(Arrays.asList(1,8,6,2,5,4,8,3,7));
        System.out.println("The maximum water that can be stored is:"+storewater(height));
    }
    public static int storewater(ArrayList<Integer> height)
    {
        int maxwater=0;
        int lp=0;
        int rp=height.size()-1;
        while(lp<rp)
        {
            int ht=Math.min(height.get(lp), height.get(rp));
            int width=rp-lp;
            int currwater= ht*width;
            maxwater=Math.max(maxwater,currwater);
            if(height.get(lp)<height.get(rp))
            {
                lp++;
            }
            else{
                rp--;
            }
        }
        return maxwater;

    }
    
}
