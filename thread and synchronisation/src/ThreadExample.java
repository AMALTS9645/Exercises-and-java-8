class Multiplyer {
	public static synchronized void multiplyAndPrint(int n) {
		System.out.println("Multiplication table of : " + n);
		for (int i = 1; i <= 10; i++) {
			System.out.println(n + " x " + i + " = " + n * i);
		}
	}
}

class MyThread1 extends Thread {
	public void run() {
//		for (int i = 10; i <= 20; i++) {
//			System.out.println("From thread 1: : i = " + i);
//			try {
//				sleep(1000);
//			} catch (Exception e) {
//
//			}
//		}
		Multiplyer.multiplyAndPrint(5);
	}
}

//class MyThread2 implements Runnable {
//	public void run() {
////		for (int i = 110; i <= 120; i++) {
////			System.out.println("From thread 2: : i = " + i);
////			try {
////				sleep(1000);
////			} catch (Exception e) {
////
////			}
////		}
//		Multiplyer.multiplyAndPrint(10);
//	}
//}

public class ThreadExample {

	public static void main(String[] args) {
		// using thread class or runnable interface
		MyThread1 t1 = new MyThread1();
//		Runnable r1 = () -> Multiplyer.multiplyAndPrint(10);
//		Thread t2 = new Thread(r1);
		Thread t2 = new Thread(() -> Multiplyer.multiplyAndPrint(10));

		t1.start();
		t2.start();
	}

}
