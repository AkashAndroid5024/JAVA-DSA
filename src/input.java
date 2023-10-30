import java.util.*;
public class input {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two numbers and a radius");
        int a=sc.nextInt();
        int b=sc.nextInt();
        float r=sc.nextFloat();
        // Consume the newline character
        sc.nextLine();
        System.out.println("Enter your full name\n");
        String fullname=sc.nextLine();
        System.out.println("Enter your first name\n");
        String name=sc.next();
        int sum=a+b;
        int area=a*b;
        int perimeter=2*(a+b);
        float areaofcircle=3.14f*r*r;
        System.out.println("Sum is"+sum);
        System.out.println("Area is"+area);
        System.out.println("Perimeter is"+perimeter);
        System.out.println("Area of the circle is"+areaofcircle);
        System.out.println("Your first name is"+name);
        System.out.println("Your full name is "+fullname);


    }

    
}
