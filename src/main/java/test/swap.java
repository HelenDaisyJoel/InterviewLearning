package test;

public class swap {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int a=10;
	int b=20;
	System.out.println("Before swap a: "+a+" and b: " +b);
//	a=a+b;
//	b=a-b;
//	System.out.println("After swap a: "+a+" and b: " +b);
	
	int temp=a;
	a=b;
	b=temp;
	System.out.println("After swap a: "+a+" and b: " +b);
	
	
	
	int c=40;
	int d=50;
	
	// Swapping logic without using a temporary variable
    a = a + b;
    b = a - b;
    a = a - b;

    System.out.println("After Swap: a = " + a + ", b = " + b);
	
	
	}

}
