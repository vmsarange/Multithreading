class YeildEx{

	public static void main(String[] args) {
		
        MyThread t1 = new MyThread();
        t1.start();

        Thread.yield();

        for (int i=1; i<=10; i++ ) {
        	
        	System.out.println("main - "+i);
        }
	}
}
class MyThread extends Thread{

	public void run(){

      Thread.currentThread().setName("ramesh");

      for (int i=1; i<=10; i++) {
      	
      	  System.out.println("ramesh - "+i);
      }
	}
}