package Learning;

public class stringBuffer {

	public static void main(String[] args) {
		String name="Java ";
//		StringBuffer sb=new StringBuffer(name);
		StringBuilder sb=new StringBuilder(name);
		sb.append("Welcome");
		name.concat("welcome");
		System.out.println(name);
		System.out.println(sb);
		System.out.println(name);
	}

}
