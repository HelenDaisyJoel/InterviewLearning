package test;

import java.util.Scanner;

public class oddEvenNumber {

	public static void main(String[] args) {
		System.out.println("Enter you number:");
		try (Scanner sc = new Scanner(System.in)) {
			int i=sc.nextInt();
			
			if(i%2==0)
			{
				System.out.println("Number " +i+" is even number");
			}
			else
				System.out.println("Number " +i+" is odd number");
		}

	}

}
