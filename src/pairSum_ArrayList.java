import java.util.*;
public class pairSum_ArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> a=new ArrayList<>();
        a.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        int target=5;
        System.out.println(pairsum(a, target));

    }
    public static boolean pairsum(ArrayList<Integer> a, int target)
    {
        int lp=0, rp=a.size()-1;
        while(lp<rp)
        {
            if(a.get(lp)+a.get(rp)==target)
            {
                return true;
            }
            else if(a.get(lp)+a.get(rp)<target)
            {
                lp++;
            }
            else
            {
                rp--;
            }
        }
        return false;
    }
        
    
    
}
