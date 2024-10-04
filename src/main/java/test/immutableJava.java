package test;

public class immutableJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "Hello";
		str = str + " World"; // This creates a new String object
		System.out.println(str);
		
		
		StringBuilder sb = new StringBuilder("Hello");
		sb.append(" World"); // Modifies the existing StringBuilder object
		System.out.println("Answer is:"+sb);
		String result = sb.toString(); // Converts back to String
		System.out.println(result);
		
		 String str1 = "Helloo";
		 String str2 = str1; // str2 references the same object as str1
	        
	        str1 = str1 + " Worldd"; // Creates a new String object
	        
//	        String str2 = str1; // str2 references the same object as str1
	        
	        System.out.println("str1: " + str1); // Outputs: Hello World
	        System.out.println("str2: " + str2); // Outputs: Hello
	        
	        
	        String s1 = "Hi";
	        String s2 = s1.concat(" Java");  // A new string "Hi Java" is created, s1 remains unchanged
	        System.out.println(s1);  // Output: "Hi" (original string is unchanged)
	        System.out.println(s2);  // Output: "Hi Java" (a new string is created)
	        System.out.println(s1);  // Output: "Hi" (unchanged)
	        
	        
//	        String s3 = new String("Hi");
//	        String s4 = new String(s3.concat(" Java"));  // A new string "Hello World" is created
//	        System.out.println(s3);  // Output: "Hello" (original string is unchanged)
//	        System.out.println(s4);  // Output: "Hello World"
//	        System.out.println(s3);  // Output: "Hello" (unchanged)
	        
	        String s11=new String("welcome");
	        String s22=new String("welcome");
	        System.out.println(s11==s22);//false   Its used to compare the objects
	        System.out.println(s11.equals(s22));



	}

}
