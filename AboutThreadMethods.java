package MultiThreading;

public class AboutThreadMethods implements Runnable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AboutThreadMethods obj = new AboutThreadMethods();
		ThreadGroup groupname = new ThreadGroup("group1");

		Thread t1 = new Thread(groupname, obj, "First Thread");
		System.out.println("first thread state : " + t1.getState());
		System.out.println("thread group name  : " + t1.getThreadGroup());
		System.out.println("first thread running : ");
		t1.start();
		System.out.println("first thread name : " + t1.getName());
		System.out.println("first thread id  : " + t1.getId());
		System.out.println("first thread priority  : " + t1.getPriority());
		System.out.println("first thread alive(before terminated)  : " + t1.isAlive());
		System.out.println("interupted : " + t1.isInterrupted());
		if (t1.isDaemon()) {
			System.out.println("is deamon");
		} else {
			System.out.println("is not deamon");
		}

		System.out.println("current thread : " + t1.currentThread());

		System.out.println("first thread state  : " + t1.getState());
		System.out.println("first thread alive (after terminated) : " + t1.isAlive());
		try {
			t1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("second thread running : ");

		Thread t2 = new Thread(obj);
		t2.start();

	}

	public void run() {
		for (int i = 0; i < 5; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(i);
		}
	}
}
