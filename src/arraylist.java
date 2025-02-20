import java.util.ArrayList;
import java.util.Collections;

public class arraylist {
    public static void main(String args[])
    {
        ArrayList<Integer> a=new ArrayList<>();
        ArrayList<String> b=new ArrayList<>();
        ArrayList<Boolean> c=new ArrayList<>();
        ArrayList<Character> d=new ArrayList<>();
        ArrayList<Float> e=new ArrayList<>();
        ArrayList<Double> f=new ArrayList<>();
        ArrayList<Long> g=new ArrayList<>();
        ArrayList<Short> h=new ArrayList<>();
        ArrayList<Byte> i=new ArrayList<>();
        ArrayList<Object> j=new ArrayList<>();
        a.add(1);
        a.add(2);
        a.add(3);
        a.add(4);
        a.add(5);
        System.out.println(a);
        a.remove(2);
        System.out.println(a);
        a.add(2, 3);
        System.out.println(a);
        System.out.println(a.get(2));
        System.out.println(a.size());
        System.out.println(a.contains(3));
        System.out.println(a.indexOf(3));
        System.out.println(a.isEmpty());
        a.clear();
        System.out.println(a.isEmpty());
        a.add(1);
        a.add(2);
        a.add(3);
        a.add(4);
        a.add(5);
        System.out.println(a);
        a.set(2, 6);
        System.out.println(a);
        a.add(2, 3);
        System.out.println(a);
        b.add("Akash");
        b.add("Vishwakarma");
        b.add("is");
        b.add("a");
        b.add("good");
        b.add("boy");
        System.out.println(b);
        for(int x=0;x<b.size();x++)
        {
            System.out.print(b.get(x)+" ");
        }
        System.out.println();
        reverseList(b);
        maxinArrayList(a);
        swap2numbers(a, 2, 4);
        System.out.println(a);
        System.out.println("Before soring");
        System.out.println(a);
        System.out.println("After sorting in ascending order:");
        Collections.sort(a);
        System.out.println(a);
        System.out.println("After sorting in descending order:");
        Collections.sort(a,Collections.reverseOrder());
        System.out.println(a);



    }

    public static void reverseList(ArrayList<String> b)
    {
        for(int x=b.size()-1;x>=0;x--)
        {
            System.out.print(b.get(x)+" ");
        }
    }
    public static void maxinArrayList(ArrayList<Integer> a)
    {
        int max=Integer.MIN_VALUE;
        for(int i=0;i<a.size();i++)
        {
            if(a.get(i)>max)
            {
                max=a.get(i);

            }
        }
        System.out.println(max);
    }
    public static void swap2numbers(ArrayList<Integer> a, int id1, int id2)
    {
        int temp=a.get(id1);
        a.set(id1,a.get(id2));
        a.set(id2, temp);

    }

    
}
