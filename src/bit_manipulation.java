import java.util.*;
public class bit_manipulation {
    public static void main(String[] args) {
        Band(5, 6);
        Bor(5, 6);
        Bxor(5, 6);
        BonesCompliment(5);
        leftshift(7, 3);
        rightshift(20, 2);
        no_is_even_or_odd(6);
        get_ith_bit(15, 2);
        set_ith_bit(45, 3);
        clear_ith_bit(45, 2);
        update_ith_bit_M2(45, 3, 1);
        check_if_a_number_is_power_of_2_or_not(17);
        clear_last_ith_bits(45, 3);
        clear_range_of_bits(219, 2, 6);
        count_set_bits(69);
        fast_exponentiation(5, 3);


       

    }
    public static void Band(int a, int b)
    {
        System.out.println(a&b);
    }
    public static void Bor(int a, int b)
    {
        System.out.println(a|b);

    }
    public static void Bxor(int a, int b)
    {
        System.out.println(a^b);
    }
    public static void BonesCompliment(int a)
    {
        System.out.println(~a);
    }
    public static void leftshift(int x, int y)
    {
        System.out.println(x<<y);
    }
    public static void rightshift(int x,int y)
    {
        System.out.println(x>>y);
    }
    public static void no_is_even_or_odd(int a)
    {
        if((a&1)==1)
        {
            System.out.println("ODD");
        }
        else{
            System.out.println("EVEN");
        }
    }
    public static void get_ith_bit(int a, int i) // To check whether i th bit is 0 or 1
    {
        int x=1<<i;
        System.out.println(a&x);
    }
    public static void set_ith_bit(int a, int i) // To set ith bit from 0 to 1 ot 1 to 1
    {
        int x=1<<i;
        System.out.println(a|x);
    }
    public static void clear_ith_bit(int a, int i) // Make the ith bit to 0 (0 to 0 or 1 to 0)
    {
        int x=1<<i;
        System.out.println(a&(~x));
    }
    public static void update_ith_bit(int a,int i) 
    {
        //Either call set_ith_bit() if you want to make the ith bit 1 or call the clear_ith_bit() if you want to make the ith bit 0

    }
    public static void update_ith_bit_M2(int a, int i, int newbit)//Method 2nd to update the ith bit
    {
        a=a&(~(1<<i));
        int bitmask=newbit<<i;
        System.out.println(a|bitmask);
    }
    public static void clear_last_ith_bits(int a, int i) // make last ith bits to 0
    {
        System.out.println(a&(~0<<i));
        //Alternate method
        System.out.println(a&(-1<<i));
    }
    public static void clear_range_of_bits(int n,int i,int j)
    {
        int a=~0<<j+1;
        int b=(1<<i)-1;
        int bitmask=a|b;
        System.out.println(n&bitmask);
    }
    public static void check_if_a_number_is_power_of_2_or_not(int a)
    {
        if((a&a-1)==0)
        {
            System.out.println(+a+" is power of 2");
        }
        else{
            System.out.println(+a+" is not power of 2");
        }
    }
    public static void count_set_bits(int a) //To count the number oif bits that are 1
    {
        int count =0;
        while(a>0)
        {
            if((a&1)!=0)
            {
                count++;
            }
            a=a>>1;
        }
        System.out.println(count);
    }
    public static void fast_exponentiation(int a, int b) // to reduce complexity from O(n) to O(log n)
    {     
        int ans=1;
        while(b>0)
        {
            if((b&1)!=0)
            {
                ans=ans*a;
            }
            a=a*a;
            b=b>>1;
        }
        System.out.println(ans);
    }
    
                                  



    
}
