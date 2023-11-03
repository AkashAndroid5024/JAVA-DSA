// Program to convert Binary to Decimal
import java.util.Scanner;
public class bin_to_dec {
    public static void main(String[] args) {
        {
            Scanner sc =new Scanner(System.in);
            System.out.println("Enter a binary number");
            int bin = sc.nextInt();
            int dec=0;
            int binary=bin;
            int power=0;
            while(bin>0)
            {
                int rem =bin%10;
                dec=dec+rem*(int)Math.pow(2,power);
                power++;
                bin=bin/10;
            }
            System.out.println("The Decimal of "+binary+" is :"+dec);
            sc.close();
        }
    }
    
}
