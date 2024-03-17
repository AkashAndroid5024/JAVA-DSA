import java.util.Arrays;
import java.util.Collections;
public class collections_and_inbuilt_sort {
    public static void main(String[] args) {
        int a[]={5,4,1,3,2};
        Arrays.sort(a,0,3);
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
        }

        Arrays.sort(a);
        System.out.println();

        System.out.println("Array using sort function to sort in ascending order");
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
        }
        System.out.println();
        Integer b[]={5,4,1,3,2};
        Arrays.sort(b,Collections.reverseOrder());// only applicable in "Integer" (as an object class) and not on "int".
        //Collections are used for sorting the array in reverse order

        Arrays.sort(b,0,3,Collections.reverseOrder());
        for(int i=0;i<b.length;i++)
        {
            System.out.print(b[i]+" ");
        }
        System.out.println();

        System.out.println("Collections used to sort the array in reverse of what the sort function performs");
        for(int i=0;i<b.length;i++)
        {
            System.out.print(b[i]+" ");
        }
    }
    
}
