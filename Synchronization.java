class Synchronization {

	public static void main(String[] args) {
		
		MyThread t1 = new MyThread();
		t1.start();
		MyThread1 t2 = new MyThread1();
		t2.start();
		MyThread2 t3 = new MyThread2();
		t3.start();
		
	}
}
class MyThread extends Thread{
   
   static Demo d = new Demo();

   public void run(){
     
      Thread.currentThread().setName("ramesh - ");
      Demo.m1();
      d.m2();

   }
}
class MyThread1 extends Thread{
    
    static Demo d2 = new Demo();
     public void run(){

     	Thread.currentThread().setName("suresh - ");
        
         Demo.m1();
         d2.m2();
     }
}
class MyThread2 extends Thread{
    
    static Demo d2 = new Demo();
     public void run(){

     	Thread.currentThread().setName("ganesh - ");
        
         Demo.m1();
         d2.m2();
     }
}
class Demo{

	public synchronized static void m1(){

		for (int i=1; i<=10; i++) {
			
			System.out.println(Thread.currentThread().getName()+" "+i+" m1()");
		}
	}
	void m2(){

		for (int i=1; i<=10; i++) {
			
			System.out.println(Thread.currentThread().getName()+" "+i+" m2()");
		}
	}
}