package test;

import java.util.Scanner;

public class removeDuplicateChar {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("Enter a string to remove duplicates: ");
			String name = scanner.next();
			

			
//			Approach-01
			
			char[] array=name.toCharArray();
			StringBuilder sb2=new StringBuilder();
			for(int i=0;i<name.length();i++) {
				
				boolean repeated=false;
				for(int j=i+1;j<array.length;j++)
				{
					if (array[i]==array[j]){
						repeated=true;
						break;
						
						
					}
				}
				if(!repeated) {
					sb2.append(array[i]);
				}
			}
			
			// Print the result
            System.out.println("String after removing duplicates: " + sb2.toString());
		}
	}
}
			
		



