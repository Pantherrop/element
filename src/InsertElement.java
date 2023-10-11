import java.util.Arrays;

public class InsertElement {
    public static void main(String[] args) {
        int[] originalArray = {1, 2, 3, 4, 5};
        int positionToInsert = 2; // Index where you want to insert the element
        int elementToInsert = 10;

        int[] newArray = insertElement(originalArray, positionToInsert, elementToInsert);

        System.out.println("Original Array: " + Arrays.toString(originalArray));
        System.out.println("Element to Insert: " + elementToInsert);
        System.out.println("Position to Insert: " + positionToInsert);
        System.out.println("Updated Array: " + Arrays.toString(newArray));
    }

    public static int[] insertElement(int[] originalArray, int position, int element) {
        if (position < 0 || position > originalArray.length) {
            System.out.println("Invalid position for insertion.");
            return originalArray;
        }

        int newArrayLength = originalArray.length + 1;
        int[] newArray = new int[newArrayLength];

        for (int i = 0, j = 0; i < newArrayLength; i++) {
            if (i == position) {
                newArray[i] = element;
            } else {
                newArray[i] = originalArray[j];
                j++;
            }
        }

        return newArray;
    }
}
