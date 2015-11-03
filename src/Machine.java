
public class Machine implements Info {

	private int id = 9;
	
	public void start() {
		System.out.println("mahcine started");
	}
	
	public void stop() {
		System.out.println("machine stopped");
	}

	@Override
	public void showInfo() {
		// TODO Auto-generated method stub
		System.out.println("machine id is: " + id);
	}
}

