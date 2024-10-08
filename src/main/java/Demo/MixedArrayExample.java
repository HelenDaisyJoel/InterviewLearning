package Demo;

public class MixedArrayExample {
    public static void main(String[] args) {
        // Create an array of Object type
        Object[] mixedArray = new Object[4];

        // Store different data types in the array
        mixedArray[0] = 10;           // Integer
        mixedArray[1] = "Hello";      // String
        mixedArray[2] = 3.14;         // Double
        mixedArray[3] = true;         // Boolean

        // Access and print elements
        for (Object element : mixedArray) {
            System.out.println("Element: " + element);
        }
    }
}
