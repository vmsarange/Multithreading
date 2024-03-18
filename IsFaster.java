class IsFaster{
 
   // static StringBuilder sb = new StringBuilder();
   static StringBuffer sb = new StringBuffer();
   static int count = 0;

	public static void main(String[] args) {
		
       Thread1 t1 = new Thread1();
       Thread2 t2 = new Thread2();

       t1.start();
       t2.start();

       try{

       	   t1.join();
       	   t2.join();
       }
       catch(InterruptedException e){


       }
      System.out.println(count);
        
	}
}
class Thread1 extends Thread{

	public void run(){

		int i=1;

		for (; i<=1000; i++ ) {
			
			IsFaster.sb.append("H ");
			IsFaster.count++;
		}
	}
}
class Thread2 extends Thread{

	public void run(){

		int i=1;

		for (; i<=1000; i++ ) {
			
			IsFaster.sb.append("W ");
			IsFaster.count++;
		}
	}
}