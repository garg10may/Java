//Print Odd numbers and even numbers from two threds such that the output

// is 1,2,3,4,5....



import java.util.concurrent.locks.Lock;

public class B {

	public static void main(String[] args) throws InterruptedException {

		String lock = "lock";

		C c = new C(lock);
		D d = new D(lock);

		Thread t1 = new Thread(new Runnable() {

			@Override
			public void run() {

				try {
					c.odd();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}

		});

		Thread t2 = new Thread(new Runnable() {

			@Override
			public void run() {

				try {
					d.even();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}

		});

		t2.start();
		Thread.sleep(10);
		t1.start();
	}

}

class C {

	private Object lock;

	public C(Object lock) {

		this.lock = lock;

	}

	public void odd() throws InterruptedException {

		synchronized (this.lock) {

			for (int i = 1; i < 10; i += 2) {

				System.out.println(i);

				lock.notify();
				lock.wait();
			}

		}
	}
}

class D {

	private Object lock;

	public D(Object lock) {

		this.lock = lock;
	}

	public void even() throws InterruptedException {

		synchronized (lock) {

			System.out.println();

			for (int i = 0; i < 10; i += 2) {

				System.out.println(i);

				lock.notify();
				lock.wait();

			}

		}
	}
}
