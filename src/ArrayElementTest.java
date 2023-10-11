import java.util.Scanner;

public class ArrayElementTest {
    public static void main(String[] args) {
        // Define an array
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        // Ask the user for the element to search
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the element you want to search for: ");
        int target = scanner.nextInt();

        // Call the search method to check if the element is present
        boolean found = searchElement(numbers, target);

        // Display the result
        if (found) {
            System.out.println(target + " is present in the array.");
        } else {
            System.out.println(target + " is not present in the array.");
        }
    }

    // Method to search for an element in an array
    public static boolean searchElement(int[] arr, int target) {
        for (int number : arr) {
            if (number == target) {
                return true; // Element found
            }
        }
        return false; // Element not found
    }
}
