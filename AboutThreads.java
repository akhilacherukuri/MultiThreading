package MultiThreading;

public class AboutThreads implements Runnable{
public void run() {
	System.out.println(Thread.currentThread().getName());
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AboutThreads obj = new AboutThreads();
		ThreadGroup threadname= new ThreadGroup("group");
		System.out.println("group name :"+threadname.getName());
		Thread t =new Thread(threadname ,obj,"one");
		t.start();
		Thread t1 =new Thread(threadname ,obj,"two");
		t1.start();
		threadname.list();
		
		
	}

}
