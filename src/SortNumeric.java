import java.util.Arrays;

public class SortNumeric {
    public static void main(String[] args) {
        // Numeric array
        int[] numericArray = {3, 2, 9, 1, 5, 7};

        // String array
        String[] stringArray = {"apple", "banana", "cherry", "date", "blueberry"};

        // Sort the numeric array in ascending order
        Arrays.sort(numericArray);

        Arrays.sort(stringArray);

        // Print sorted numeric array
        System.out.println("Sorted Numeric Array: ");
        for (int num : numericArray) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Print sorted string array
        System.out.println("Sorted String Array: ");
        for (String str : stringArray) {
            System.out.print(str + " ");
        }
        System.out.println();
    }
}
