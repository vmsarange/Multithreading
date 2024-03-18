class Arithmatic{

	public static void main(String[] args) {
		
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);

      ThreadGroup group = new ThreadGroup("arithmaticoperation");
        System.out.println(group.activeCount());
        MyThread1 t1 = new MyThread1(a,b);
        Thread r1 = new Thread(group,t1,"addition");
        MyThread2 t2 = new MyThread2(a,b);
        Thread r2 = new Thread(group,t2,"substraction");
        MyThread3 t3 = new MyThread3(a,b);
        Thread r3 = new Thread(group,t3,"multiplication");
        MyThread4 t4 = new MyThread4(a,b);
        Thread r4 = new Thread(group,t4,"division");
       
        r1.start();
        r2.start();
        r3.start();
        r4.start();
	}
}
class MyThread1 implements Runnable{
  
   int a ;
   int b ;
   MyThread1(int a ,int b){
   
     this.a = a;
     this.b=b;
   }
   public void run(){

      System.out.println("Addition : "+(a+b)+"-"+Thread.currentThread().getName());
   }
}
class MyThread2 implements Runnable {
  
   int a ;
   int b ;
   MyThread2(int a ,int b){
   
     this.a = a;
     this.b=b;
   }
   public void run(){

      System.out.println("Substraction : "+(a-b)+"-"+Thread.currentThread().getName());
   }

}
class MyThread3 implements Runnable{
  
   int a ;
   int b ;
   MyThread3(int a ,int b){
   
     this.a = a;
     this.b=b;
   }
   public void run(){

      System.out.println("Multiplication : "+(a*b)+"-"+Thread.currentThread().getName());
   }

}
class MyThread4 implements Runnable{
  
   int a ;
   int b ;
   MyThread4(int a ,int b){
   
     this.a = a;
     this.b=b;
   }
   public void run(){

      System.out.println("Division : "+(a/b)+"-"+Thread.currentThread().getName());
   }

}
