public class constructor {
    int length, breadth;
    int radius;
    int side;
    constructor(int side)
    {
     this.side=side;
    }
    constructor(int length, int breadth)
    {
     this.length=length;
     this.breadth=breadth;
    }
    constructor()
    {
     radius=7;
    }

    public static void main(String[] args) 
    {
       //Scanner sc=new Scanner(System.in);
       constructor ob=new constructor(5);
       constructor obj=new constructor(2,10);
       constructor os=new constructor();
       System.out.println("Area of Square is : "+ob.side*ob.side);
       System.out.println("Area of Rectangle is : "+obj.length*obj.breadth);
       System.out.println("Area of Circle is : "+(3.14*os.radius*os.radius));      
    }
    
}
