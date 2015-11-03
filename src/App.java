import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class App {

	public static void main(String[] args) {
		
		HashMap<Integer, String> map = new HashMap<Integer, String>();

		LinkedHashMap<Integer, String> lmap = new LinkedHashMap<Integer, String>();
		
		TreeMap<Integer, String> tmap = new TreeMap <Integer, String>();
		
		
		testMap(map);
		System.out.println("-----");
		testMap(lmap);
		System.out.println("----");
		testMap(tmap);
		
		
	}		
		public static void testMap(Map<Integer, String> map) {
					
		map.put(23234243,"s");
		map.put(1, "asdf");
		map.put(11,"01");		
		map.put(0, "zebra");
		map.put(2, "apple");
		map.put(3, "bananna");
		map.put(4, "nice");
		
				
		for( Map.Entry<Integer, String> entry: map.entrySet()) {
			
			int key = entry.getKey();
			
			String value = entry.getValue();
			
			System.out.println(key + ": " + value);
			
			
		}
		
	}
}
