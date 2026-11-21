package threads;

public class Demo {

	public static void main(String[] args) {
		MultiThreadingAgain mt = new MultiThreadingAgain(); 
		
		Thread t1 = new Thread(mt);
		Thread t2 = new Thread(mt);
		Thread t3 = new Thread(mt);
		
		t1.setName("ADD");
		t2.setName("PRINTCHAR");
		t3.setName("PRINTNUM");
		
		t1.start();
		t2.start();
		t3.start();
		
	}
}
