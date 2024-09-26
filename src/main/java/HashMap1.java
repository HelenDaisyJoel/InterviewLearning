import java.util.Map;
import java.util.HashMap;

public class HashMap1 {
	public static void main(String[] args) {
		
		Map<String,Integer> map= new HashMap<>();
		map.put("Apple",120);
		map.put("Mango",100);
		map.put("Apple",180);
		map.put("Mango",120);
		System.out.println(map);
		System.out.println(map.get("Apple"));
	}

}
