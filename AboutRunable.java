package MultiThreading;

public class AboutRunable implements Runnable {
	public void run() {
		System.out.println("thread running....");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AboutRunable obj= new AboutRunable();
		Thread t = new Thread(obj);
		t.start();
	}

}
