package MultiThreading;

public class JoinThread extends Thread{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JoinThread obj= new JoinThread();
		JoinThread obj1= new JoinThread();
		System.out.println("First thread running...");
			obj.setDaemon(true);

		obj.start();
		try {
			obj.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("second thread running...");
		obj1.start();
	}
	public void run() {
		System.out.println("Thread name : "+Thread.currentThread().getName());
		System.out.println("Thread prority : "+Thread.currentThread().getPriority());
		if(Thread.currentThread().isDaemon()) {
			System.out.println("thread is deamon");
		}else {
			System.out.println("thread is not deamon");
		}
		for (int i = 0; i < 5; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(i);
		}
	}

}
