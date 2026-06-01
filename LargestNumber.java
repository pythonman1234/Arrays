public class Main {
    public static void main(String[] args) {
        // Step 1: Define an array with some numbers
        int[] numbers = {12, 45, 67, 23, 89, 5};
        
        // Step 2: Initialize 'max' with the very first element
        int max = numbers[0];
        
        // Step 3: Loop through the rest of the array starting from index 1
        for (int i = 1; i < numbers.length; i++) {
            // Step 4: Compare current element with our 'max'
            if (numbers[i] > max) {
                max = numbers[i]; // Update max if a larger value is found
            }
        }
        
        // Step 5: Print the final result
        System.out.println("The largest element is: " + max);
    }
}
