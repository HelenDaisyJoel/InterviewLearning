package test;

public class FindPairs {

    public static void findPairs(int[] array, int sum) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] + array[j] == sum) {
                    System.out.println("Pair: (" + array[i] + ", " + array[j] + ")");
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        findPairs(array, 10);
    }
}
