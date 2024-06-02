public class recursion_exponent {
    public static void main(String[] args) 
    {
        
            long p=optimizedpow(8,25);
            System.out.println("Power value is :"+p);
    }
    public static long optimizedpow(int a, int n)
    {
            if(n==0)
            {
                return 1;
            }
            long halfpower=optimizedpow(a,n/2);
            long halfpowersq=halfpower*halfpower;
            if(n%2!=0)
            {
                halfpowersq=n*halfpowersq;
            }
            return halfpowersq;
    }
    
    
}
