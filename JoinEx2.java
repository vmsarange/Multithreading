class JoinEx2{

	public static void main(String[] args) throws InterruptedException {
		
		Thread t2 = Thread.currentThread();
      
        Thread1 t1 = new Thread1();
        t1.start();

        for (int i=1; i<=5; i++) {
        	
        	try{
                  
		            t1.join();
        	}
        	catch(InterruptedException ie){

        		System.out.println("I got interrupted");
        	}
        	System.out.println(Thread.currentThread().getName());
        }
	}
}
class Thread1 extends Thread {
   
   public void run(){
       
   	  Thread.currentThread().setName("ramesh");

        for (int i=1; i<=5; i++) {
        	
        	System.out.println(Thread.currentThread().getName()+i);
        }
   }
}