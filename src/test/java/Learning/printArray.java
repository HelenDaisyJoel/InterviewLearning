package Learning;

import java.lang.reflect.Array;
import java.util.Scanner;

public class printArray {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name:");
        String name=scanner.next();
        char[] arrayName=name.toCharArray();
        for(char ch:arrayName) {
        	System.out.println(ch);
        	
        }
	}

}
