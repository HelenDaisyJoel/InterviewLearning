package Learning;

import java.util.Scanner;

public class reverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.out.println("Enter the name: ");
		Scanner sc=new Scanner(System.in);
		String name=sc.next();
		char[] nameArray=name.toCharArray();
		
			for(int j=nameArray.length-1;j>=0;j--) {
				
				System.out.print(nameArray[j]);
			}
		}
		
		
		

	}


