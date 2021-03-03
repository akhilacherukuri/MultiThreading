package MultiThreading;
class sample extends Thread{
	public void run() {
		System.out.println("first thread");
	}
}
class sample1 extends Thread{
	public void run() {
		System.out.println("second thread");
	}
}
public class MulTaskByMulThreads {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sample obj = new sample();
		obj.start();
		sample1 obj1 = new sample1();
		obj1.start();

	}
	

}
