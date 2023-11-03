// Program to show Function Overloading
public class function_overloading {
    public static void main(String[] args) {
       
        float radius=14.0f;
        int length =10;
        int breadth =25;
        int side =13;
        area(radius);
        area(length, breadth);
        area(side);
    }
    public static void area(float radius)
    {
        System.out.println("Area of the Circle is : "+(3.14*radius*radius));
        return;
    }
    public static void area(int length, int breadth)
    {
        System.out.println("Area of the Rectangle is : "+(2*(length+breadth)));
    }
    public static void area(int side)
    {
        System.out.println("Area of Square is : "+(side*side));

    }

    
    
}
