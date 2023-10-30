public class reverseArray {
    public static void reverse(int number[]){
        int start=0;
        int last= number.length-1;

        // Swap the first and last number
        while (start<last){
            int temp = number[start];
            number[start] = number[last];
            number[last]= temp;

            start++;
            last--;
        }

        for (int i=0; i<number.length; i++){
            System.out.print(number[i]+" ");
        }




    }

    public static void main(String[] args) {
        int number[]={34, 56, 92, 44, 63, 77};

        reverse(number);
    }
    
}
