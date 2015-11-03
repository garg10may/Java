
class Frog {

	private String name;
	private int id;
	
	public String toString() {	
		
		return String.format("%4d: %s",  id,name);
	}
	
	public Frog(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
}

public class Hello {
	public static void main(String[] args) {
		Frog frog1 = new Frog(9, "tanmay");
		System.out.println(frog1);
	}
}
