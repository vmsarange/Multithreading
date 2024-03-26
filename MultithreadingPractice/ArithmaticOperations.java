class ArithmaticOperations{

   public static void main(String[] args) {
   	  
   	    int n1 = Integer.parseInt(args[0]);
   	    int n2 = Integer.parseInt(args[1]);

   	    MyThread t1 = new MyThread(n1,n2);
   	    t1.start();
   }

}
class MyThread extends Thread{

   int a;
   int b;
   Operations operate = new Operations();

   MyThread(int a,int b){

   	  this.a = a;
   	  this.b = b;
   }
   public void run(){

      operate.addition(a,b);
      operate.substraction(a,b);
      operate.multiplication(a,b);
      operate.division(a,b);
      operate.modulus(a,b);

   }
}
class Operations{

	 void addition(int a,int b){

		System.out.println("Addition : "+(a+b));
	}
	 void substraction(int a,int b){

		System.out.println("Substraction : "+(a-b));
	}
	 void multiplication(int a,int b){

		System.out.println("Multiplication : "+(a*b));
	}
	 void division(int a,int b){

		System.out.println("Division : "+(a/b));
	}
	 void modulus(int a,int b){

		System.out.println("Modulus : "+(a%b));
	}
}