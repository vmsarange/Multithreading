class RunnableEx{

	public static void main(String[] args) {
		
		MyThread r1 = new MyThread();
		Thread t1 = new Thread(r1);

		t1.start();

	}
}
class MyThread implements Runnable{

	public void run(){

		System.out.println(Thread.currentThread().getName());
	}
}