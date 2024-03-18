class IsFaster2 {

	public static void main(String[] args) {
		
		StringBuffer sb = new StringBuffer();

		long extStrt = System.currentTimeSeconds();

		for(int i =0; i<=10000; i++){

			sb.append("Hello");
		}

		System.out.println("StringBuffer : "+System.currentTimeMillis()+"-"+extStrt);

		StringBuilder sb1 = new StringBuilder();

		long extStrt2 = System.currentTimeSeconds();

		for(int i =0; i<=10000; i++){

			sb1.append("Hello");
		}

		System.out.println("StringBuilder : "+System.currentTimeSeconds()+"-"+extStrt2);
	}
}