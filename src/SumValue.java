public class SumValue {
    public static void main(String[] args) {
        // Define an array of integers
        int[] numbers = {1, 2, 3, 4, 5};

        // Initialize a variable to hold the sum
        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }

        // Print the sum
        System.out.println("Sum of the elements in the array: " + sum);
    }
}
