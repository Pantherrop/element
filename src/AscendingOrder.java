import java.util.Scanner;
import java.util.Arrays;

public class AscendingOrder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the size of the array
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        // Create an array to store the elements
        int[] arr = new int[size];

        // Input array elements
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            arr[i] = scanner.nextInt();
        }

        // Sort the array in ascending order
        Arrays.sort(arr);

        // Display the sorted array
        System.out.println("Sorted Array (in ascending order):");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }

        scanner.close();
    }
}
