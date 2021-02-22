package MultiThreading;

public class AboutThread extends Thread{
//They are two ways to create a thread
//	○ By extending Thread class
//	○ By implementing the Runnable interface.
	public void run() {
		System.out.println("thread running....");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AboutThread obj = new AboutThread();
		obj.start();

	}

}
