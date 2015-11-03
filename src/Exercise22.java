import java.util.HashMap;

public class Exercise22 {

	public static HashMap<Character, Character> rot13_key() {

		HashMap<Character, Character> m = new HashMap<Character, Character>();

		for (char c = 'a'; c <= 'm'; c++) {
			m.put(c, (char) (c +13));
		}
		for (char c = 'A'; c <= 'M'; c++) {
			m.put(c, (char) (c +13));
		}
		for (char c = 'n'; c <= 'z'; c++) {
			m.put(c, (char) (c -13));
		}
		for (char c = 'N'; c <= 'Z'; c++) {
			m.put(c, (char) (c -13));
		}
		return m;
	}

	public static String rot13_encoder_decoder(String x) {
		
		String s = "";
		char c;
		HashMap<Character, Character> key = rot13_key();
		
		for ( int i=0; i<x.length(); i++) {
			
			c = x.charAt(i);
			
			if ( key.get(c) != null) {
				
				s += key.get(c);
			} else {
				s += c;
			}
		}
		
		return s;
		
	}
	public static void main(String[] args) {

		System.out.println( rot13_encoder_decoder("Pnrfne pvcure? V zhpu cersre Pnrfne fnynq!"));
	}
}
