package test;

public class validation {

    public static void main(String[] args) {
        // Input string with spaces and special characters
        String name = "% 2 B 3 4 c d # 5 A";

        // Convert to uppercase
        String newString = name.toUpperCase();

        // Extract special characters
        String specialCharacters = newString.replaceAll("[A-Z0-9\\s]", ""); // Removes alphabets, numbers, and spaces

        // Extract alphabets only
        String alphabets = newString.replaceAll("[^A-Z]", ""); // Keeps only alphabets, removes everything else
        
        // Extract alphabets only
        String numbers = newString.replaceAll("[^0-9]", ""); // Keeps only alphabets, removes everything else


        // Print the results
        System.out.println("Special characters: " + specialCharacters);
        System.out.println("Alphabets: " + alphabets);
        System.out.println("numbers: " + numbers);
    }
}
