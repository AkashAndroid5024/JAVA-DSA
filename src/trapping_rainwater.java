import java.lang.*;
public class trapping_rainwater {
   
        public static void main(String[] args) {
            int height[]={4,2,0,6,3,2,5};
            System.out.println(trappedrainwater(height));
        }
        public static int trappedrainwater(int height[])
        {
            int n=height.length;
            // to calculate left max boundary
            int left_max[]=new int [n];
            left_max[0]=height[0];
            for(int i=1;i<n;i++)
            {
                left_max[i]=Math.max(height[i],left_max[i-1]);
            }
            //to calculate right max
            int right_max[]=new int[n];
            right_max[n-1]=height[n-1];
            for(int i=n-2;i>=0;i--)
            {
                right_max[i]=Math.max(height[i],right_max[i+1]);
            }
            //loop
            int trappedRainwater=0;
            for(int i=0;i<n;i++)
            {
                //waterlevel
                int waterlevel=Math.min(left_max[i],right_max[i]);
                trappedRainwater+=waterlevel-height[i];
    
            }
            return trappedRainwater;
        }
        
    }
    
    

