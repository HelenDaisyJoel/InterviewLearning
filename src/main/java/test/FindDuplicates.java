package test;

public class FindDuplicates {
    public static void main(String[] args) {
        int[] a = {10, 20, 30, 10, 20, 40, 50};

        System.out.println("Duplicate elements in the array:");
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] == a[j]) {
                    System.out.println(a[i]);
                    break;
                }
            }}}}