package test;

import java.util.Scanner;

public class removeDuplicateChar {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("Enter a string to remove duplicates: ");
			String name = scanner.next();
			
//			Approach-01
//			StringBuilder sb=new StringBuilder();
//			name.chars().distinct().forEach(c->sb.append((char)c));
//			System.out.println(sb);
			
//			Approach-02
			
//			StringBuilder sb1=new StringBuilder();
//			for(int i=0;i<name.length();i++)
//			{
//					char ch=name.charAt(i);
//					int idx=name.indexOf(ch,i+1);
//					if(idx==-1) {
//						
//						sb1.append(ch);
//						
//						
//					}
//					
//					
//			}
//			System.out.println(sb1);
//		}
//
//	}
			
//			Approach-02
//			
			char[] array=name.toCharArray();
			StringBuilder sb2=new StringBuilder();
			for(int i=0;i<name.length();i++) {
				
				boolean repeated=true;
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
			}System.out.println(sb2);
			
		}
	}
}


