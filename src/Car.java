
public class Car extends Machine {

	protected String name = "Machine Type 1";
	
	
	public void kew() {
		System.out.println("i'm a new method");
	}

	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.println("car started");
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		super.stop();
	}
	
}
