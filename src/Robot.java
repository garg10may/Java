
public class Robot {
	
	private int id;
	
	public class Brain {
		public void think() {
			System.out.println("Robot " + id + " is thinking");
		}
	}
	
	static class Battery {
		
		
	}

	public Robot(int id) {
		this.id = id;
	}
	
	public void start(){
		
		System.out.println("robot starting" + id);
		
		Brain brain = new Brain();
		brain.think();
	}
	

}
