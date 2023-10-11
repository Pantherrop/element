import java.util.Arrays;

public class TestEquality {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {1, 2, 3, 4, 5};
        int[] array3 = {5, 4, 3, 2, 1};

        boolean areEqual1And2 = areArraysEqual(array1, array2);
        boolean areEqual1And3 = areArraysEqual(array1, array3);

        System.out.println("Are array1 and array2 equal? " + areEqual1And2);
        System.out.println("Are array1 and array3 equal? " + areEqual1And3);
    }

    public static boolean areArraysEqual(int[] array1, int[] array2) {
        // Check if the arrays are the same length
        if (array1.length != array2.length) {
            return false;
        }

        // Sort the arrays to ensure elements are in the same order
        Arrays.sort(array1);
        Arrays.sort(array2);

        // Compare each element
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] != array2[i]) {
                return false; // Arrays are not equal
            }
        }

        return true; // Arrays are equal
    }
}
