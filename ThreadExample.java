package MultiThreading;

public class ThreadExample implements Runnable {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadExample obj = new ThreadExample();
		System.out.println("inside main method");
		Thread t2 = new Thread(obj);
		t2.start();

	}

	@Override
	public void run() {
		ThreadExample obj = new ThreadExample();
		Thread t1 = new Thread(obj);
		System.out.println("inside run methods");

		for (int i = 0; i < 5; i++) {
			System.out.println(i);
		}
		t1.start();
	}

}
