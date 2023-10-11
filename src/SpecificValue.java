public class SpecificValue {
    public static void main(String[] args) {
        // Sample array
        int[] numbers = {1, 2, 3, 4, 5, 6};

        // Value to check for
        int targetValue = 3;

        // Flag to track if the value is found
        boolean found = false;

        // Iterate through the array to check if the target value is present
        for (int number : numbers) {
            if (number == targetValue) {
                found = true;
                break; // Value found, no need to continue searching
            }
        }

        // Display the result
        if (found) {
            System.out.println("The array contains the value " + targetValue);
        } else {
            System.out.println("The array does not contain the value " + targetValue);
        }
    }
}
