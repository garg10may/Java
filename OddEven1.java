public class B {

	public synchronized void printOdd() throws InterruptedException {

		for (int i = 1; i < 10; i += 2) {

			System.out.println(i);
			
			notify();
			wait();
		}
	}

	public synchronized void printEven() throws InterruptedException {

		for (int i = 0; i < 10; i += 2) {

			System.out.println(i);
			
			notify();
			wait();
		}
	}

	public static void main(String[] args) throws InterruptedException {

		B b = new B();

		Thread t1 = new Thread(new Runnable() {

			public void run() {

				try {
					b.printEven();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});

		Thread t2 = new Thread(new Runnable() {

			public void run() {

				try {
					b.printOdd();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});

		t1.start();
		t2.start();

	}

}
