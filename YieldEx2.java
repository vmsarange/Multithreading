class Yeild{

	public static void main(String[] args) {
		
         MyThread  t1 = new MyThread();

         t1.start();

         Thread.yield();

        for(int i=1; i<=5; i++){

		   System.out.println("from main thread"+"-"+i);

        }
	}
}
class MyThread extends Thread{

	public void run(){
        
        Thread.currentThread().setPriority(1);
		Thread.currentThread().setName("ramesh");
         
        for(int i=1; i<=5; i++){

		System.out.println("from ramesh thread"+"-"+i);

        }
	}
}