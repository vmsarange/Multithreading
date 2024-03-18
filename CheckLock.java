class CheckLock{

	public static void main(String[] args) {
		
		MyThread t1 = new MyThread();
		MyThread t2 = new MyThread();
		MyThread t3 = new MyThread();

		t1.start();
		t2.start();
		t3.start();

	}
}
class MyThread extends Thread{
   static Demo d = new Demo();

	public void run(){
     
       Demo.m1();
       d.m2();
       d.m3();
       
	}
}
class Demo{

	static synchronized void m1(){

		for (int i=1; i<=5; i++) {
			
			try{
				Thread.sleep(1000);
			}
			catch(InterruptedException ie){

			}
			Thread.currentThread().setName("RAMESH");
			System.out.println(Thread.currentThread().getName()+" => m1() "+i);
		}
	}
	 synchronized  void m2(){
  
        Thread.currentThread().setName("ganesh");
		
		for (int i=1; i<=5; i++) {
			
			System.out.println(Thread.currentThread().getName()+" => m2() "+i);
		}
	}
	   void m3(){

		for (int i=1; i<=5; i++) {

			try{
				Thread.sleep(1000);
			}
			catch(InterruptedException ie){

			}
			Thread.currentThread().setName("mahesh");
			System.out.println(Thread.currentThread().getName()+" => m3() "+i);
		}
	}
}