package test;

public class printLetterFromStringMultiple {
	
	  public static void main(String[] args) {
	 String str = "hello";  // You can change the input string
	  for (int i = 0; i < str.length(); i++) {
          char letter = str.charAt(i);
          for (int j = 0; j <= i; j++) {
              System.out.print(letter);
          }
          System.out.println(); // Move to the next line after printing the letter pattern
      }

}
}
