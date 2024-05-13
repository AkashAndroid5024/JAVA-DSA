import java.util.*;
public class objects
{
    public static void main(String[] args) 
    {
        
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the name , branch and rollno of the student");
            String name=sc.nextLine();
            String branch =sc.nextLine();
            int rollno=sc.nextInt();
            Sam obj = new Sam();
            obj.fun1(name);
            obj.fun2(branch);
            obj.fun3(rollno);
            sc.close();
    }
}
     class Sam
    {
        void fun1(String name)
        {
            System.out.println(name);
        }
        void fun2(String branch)
        {
            System.out.println(branch);
        }
        void fun3(int rollno)
        {
            System.out.println(rollno);
        }
    }
