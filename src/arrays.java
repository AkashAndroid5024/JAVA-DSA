import java.util.Scanner;

public class arrays {
    public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the length of Array");
            int n = sc.nextInt();
            int arr[] = new int[n];
            System.out.println("Enter " + n + " elements");
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            sc.close();
            update(arr);
            System.out.println("Updated Array is :");
            for (int i = 0; i < n; i++) {
                System.out.println(arr[i]);
            }


    }
        public static void update( int arr[])
        {
            for (int i = 0; i < (arr.length); i++) {
                arr[i] +=  1;
            }
            return;
        }
    }
    

