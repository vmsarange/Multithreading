class Syncro{

	public static void main(String[] args) {
		
		Greeting g = new Greeting();

		MyThread t1 = new MyThread(g,"RAMESH");
		MyThread t2 = new MyThread(g,"SURESH");

		t1.start();
		t2.start();

	}
}
class MyThread extends Thread{
   
   Greeting g ;
   String name;

   MyThread (Greeting g , String name){

   	this.g = g;
   	this.name = name;

   }
   public void run(){

   	  g.greet(name);
   }

}
class Greeting{

  public synchronized void greet(String name){

  	for (int i=1; i<11; i++) {
  		
  		try{

  			Thread.sleep(1000);

  		}
  		catch(InterruptedException e){

  		}
  		System.out.println("hello "+name);
  	}
  }

}