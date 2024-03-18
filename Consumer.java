class Consumer{

	public static void main(String[] args) throws InterruptedException {
	
		Producer p1 = new Producer();
		p1.start();
      
      // Thread.sleep(0,1);
      
		p1.setName("ramesh");
   	synchronized(p1){

           p1.wait(0,1);
           System.out.println(p1.sum);

		}
	}
}
class Producer extends Thread{

   int sum ;
	public void run(){
      
		synchronized(this){
        
			for (int i=1; i<10000; i++ ) {
			
			sum+=i;
		  }
		  this.notify();
		}
	}
}