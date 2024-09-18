package test;

import java.util.Arrays;

public class ReplaceWithOccurance {

	public static void main(String[] args) {
		String input="Opentext";  //output:Open1ex2
		String charToReplace="t";
		
		if(input.indexOf(charToReplace)==-1) {
			System.out.println("No occurance of Repeated value");
			
		}
		char[] arr=input.toCharArray();
		char charToReplaceChar = charToReplace.charAt(0);  // Convert the string to a char
		int count=1;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==charToReplaceChar)
			{
				arr[i]=String.valueOf(count).charAt(0);
				count ++;
				
			}
		}
		System.out.println(Arrays.toString(arr));
	}

}
