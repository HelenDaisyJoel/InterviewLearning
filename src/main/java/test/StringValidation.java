package test;

public class StringValidation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name="% 2 B 3 4 c d # 5 A";

		String specialChar = null;
		String specialNumber=null;
		
		String newString=name.toUpperCase();
		
		
		for(int i=0;i<newString.length()-1;i++) {
			
			specialChar=newString.toString().replaceAll("[A-Za-z0-9\\s]", "");
			specialChar.trim();
			
			
			String specialNumber1=newString.toString().replaceAll("[0-9%#\\s]", "");
				
			
			
			
		}
		System.out.println("Special Characters are:"+specialChar.toString());
		
		System.out.println("Special Characters are:"+specialNumber.toString());
		
		
		
		
		
		
	}

}
