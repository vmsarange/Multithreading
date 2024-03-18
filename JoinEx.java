class JoinEx{

	public static void main(String[] args) throws InterruptedException {
		
       MyThread t1  = new MyThread();
       t1.start();

       t1.join();

       for (int i = 1; i<=10; i++) {
       	
       	  System.out.println("main - "+i);
       }
	}
}
class MyThread extends Thread{

	public void run(){
      
       try{

       	   Thread.sleep(500);
       }
       catch(InterruptedException i){

       }
       Thread.currentThread().setName("ramesh");

       for (int i=1; i<=10; i++) {
       	   
       	   System.out.println("ramesh - "+i);
       }
	}
}