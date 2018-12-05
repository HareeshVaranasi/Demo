class Test extends Thread {
	public void run() {
		System.out.println("Extends Thread class");
	}
}

public class ThreadExtends {
	public static void main(String args[]) {
		Test t = new Test();
		t.start();
	}
}
