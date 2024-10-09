package test;

import java.util.HashSet;
import java.util.Set;

public class stringOccurance {
	public static void main(String[] args) {
		String input1="Java is the programming language";  //output:Open1ex2
		String input2="I like Java for programming language";
		Set<String> inputSet1=new HashSet<String>();
		Set<String> inputSet2=new HashSet<String>();
		
		
		for(String word:input1.split(" ")) {
			inputSet1.add(word);
		}
		
		for(String word:input2.split(" ")) {
			inputSet2.add(word);
		}
		inputSet1.retainAll(inputSet2);
		System.out.println(inputSet1);
		
		
		
		
		
	}

}
