package test;

public class convertToArray {
	 public static void main(String[] args) {
	 String str = "Hello";
     char[] charArray = str.toCharArray();
//     
//     System.out.print("Enter a string to remove duplicates: ");
//		String name = scanner.next();

     // Loop through the characters in the array
     for (int i = 0; i < charArray.length; i++) {
         // Print each character (i+1) times
//         for (int j = 0; j <= i; j++) {
        	 
        	 //for (int j = charArray.length; j >= i; j--) {
             System.out.print(charArray[i]+" ");
         }
         // Move to the next line after printing each character multiple times
         System.out.println();
     }

}

