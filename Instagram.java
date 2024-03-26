class Instagram{

    String name;
    int followers;

    Instagram(String name,int followers){

    	this.name = name;
    	this.followers= followers;
    }
    Instagram(Instagram obj){
    	
    	name = obj.name;
    	followers = obj.followers;
    }
    public String toString(){

    	return "Hii my name is "+this.name+" I have "+this.followers+" followers.";
    }
}
class InstaDriver{

	public static void main(String[] args) {
		
		Instagram mobile = new Instagram("vaishnavi",1000);
		Instagram laptop = new Instagram(mobile);

		System.out.println(mobile);
		System.out.println(laptop);

		mobile.followers = 11000;
		System.out.println(mobile);
		System.out.println(laptop);
	}
}