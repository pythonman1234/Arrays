package Arrays;

import java.util.Arrays;

public class ReverseArray {
    public static void Reverse(int numbers[]){
        int start = 0;
        int end = numbers.length-1;

        while(start<end){
            int temp = numbers[start];
            numbers[start] = numbers[end];
            numbers[end] = temp;
            start++;
            end--;
        }
    }
    public static void main(String args[]){
        int [] numbers = {1,2,3,4,5};
        System.out.println("Original"+ Arrays.toString(numbers));
        Reverse(numbers);
        System.out.println("Reversed"+Arrays.toString(numbers));
    }
}
