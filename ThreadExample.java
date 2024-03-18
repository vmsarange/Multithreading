class ThreadExample{

	public static void main(String[] args) {
		
		MyThread t1 = new MyThread();
		t1.start();
        t1.run(); // main thread

	}
}
class MyThread extends Thread{

	public void run(){
       
       // Thread.currentThread().setName("ramesh");
		System.out.println(Thread.currentThread().getName()+" Hello");
	}
}