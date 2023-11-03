// Program to convert Decimal to Binary
import java.util.Scanner;

public class dec_to_bin {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
            System.out.println("Enter a decimal number");
            int dec = sc.nextInt();
            int bin=0;
            int decimal=dec;
            int power=0;
            while(dec>0)
            {
                int rem =dec%2;
                bin=bin+rem*(int)Math.pow(10,power);
                power++;
                dec=dec/2;
            }
            System.out.println("The Binary of "+decimal+" is :"+bin);
            sc.close();
    }
    
}
