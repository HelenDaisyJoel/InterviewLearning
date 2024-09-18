package test;

public class RemoveSpecialChar {

	public static void main(String[] args) {
		String str="@#J*&a$%#va^%$Lear*&%n$#ing-20";
		String plainString=str.replaceAll("[^A-Za-z0-9]", "  ");
		System.out.println(plainString);
		
		String trimmedString=plainString.trim(); //Remove spaces between front and end of the string
		System.out.println(trimmedString);
		
		
		String trimmedString1=plainString.replaceAll("\\s", ""); //Replace all the between strings to be empty space
		System.out.println(trimmedString1);
	}

}
