class Ex1 {

	public static void main(String[] args) {
		
		MyThread t1 = new MyThread();
		t1.start();

		for (int i=0; i<=10; i++) {
			
			System.out.println(Thread.currentThread().getName()+"-"+i);
		}
	}
}
class MyThread extends Thread{

    @Override
	public void run(){

        Thread.currentThread().setName("Vaishnavi");
		for (int i=0; i<=10; i++) {
			
			System.out.println(Thread.currentThread().getName()+"-"+i);
		}
	}
}