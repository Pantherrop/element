import java.util.HashSet;

public class DuplicateValue {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 2, 5, 6, 4, 7, 8, 9, 5};

        // Create a HashSet to store unique values
        HashSet<Integer> uniqueValues = new HashSet<>();
        // Create a HashSet to store duplicate values
        HashSet<Integer> duplicateValues = new HashSet<>();

        for (int num : arr) {
            // If the number is already in uniqueValues, it's a duplicate
            if (!uniqueValues.add(num)) {
                duplicateValues.add(num);
            }
        }

        // Print the duplicate values
        System.out.println("Duplicate values in the array are: " + duplicateValues);
    }
}
