package MultiThreading;

public class About_priority extends Thread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		About_priority obj = new About_priority();
		About_priority obj1 = new About_priority();
		About_priority obj2 = new About_priority();

		obj.start();
		System.out.println(obj.getPriority());
		System.out.println(obj1.getPriority());
		System.out.println(obj2.getPriority());
		
		obj.setPriority(2);
		obj1.setPriority(6);
		obj2.setPriority(8);
		//IllegalArgumentException (if value of parameter newPriority goes beyond minimum(1) and maximum(10) limit.)
		//obj.setPriority(11);
		System.out.println("after set the priority : ");
		System.out.println(obj.getPriority());
		System.out.println(obj1.getPriority());
		System.out.println(obj2.getPriority());

		System.out.println("max priority : "+obj.MAX_PRIORITY);
		System.out.println("min priority : "+obj.MIN_PRIORITY);
		System.out.println("norm priority : "+obj.NORM_PRIORITY);
		
	}
	public void run() {
		System.out.println("run method");
	}

}
