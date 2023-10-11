import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CommonElement {
    public static void main(String[] args) {
        // Define two arrays of string values
        String[] array1 = {"apple", "banana", "cherry", "date", "kiwi"};
        String[] array2 = {"banana", "date", "grape", "kiwi", "orange"};

        // Find common elements between the two arrays
        String[] commonElements = findCommonElements(array1, array2);

        // Print the common elements
        System.out.println("Common Elements:");
        for (String element : commonElements) {
            System.out.println(element);
        }
    }

    public static String[] findCommonElements(String[] array1, String[] array2) {
        // Convert the arrays to ArrayList for easier element comparison
        List<String> list1 = new ArrayList<>(Arrays.asList(array1));
        List<String> list2 = new ArrayList<>(Arrays.asList(array2));

        // Create a list to store common elements
        List<String> commonElementsList = new ArrayList<>();

        // Iterate through the first list
        for (String element : list1) {
            // If the element is present in the second list, add it to the common elements list
            if (list2.contains(element)) {
                commonElementsList.add(element);
            }
        }

        // Convert the common elements list back to an array
        return commonElementsList.toArray(new String[0]);
    }
}
