package Learning;

import java.util.Scanner;

public class printArrayMultiple {
	
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name:");
        String name=scanner.next();
//        char[] arrayName=name.toCharArray();
        for(int i=0;i<name.length();i++) {
        	
        	 char letter = name.charAt(i);
        	for(int j=0;j<=i;j++) {
        	System.out.print(letter);
        	
        }
        	System.out.println(); // Move to the next line after printing the letter pattern
        
        

}
}
}
