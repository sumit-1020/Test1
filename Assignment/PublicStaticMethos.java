package Assignments;

public class PublicStaticMethos {
	
	static void stat() {
		System.out.println("I am static methos");
	}
	
	public void publi() {
		System.out.println("I am public methos");
	}

	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		stat();
		PublicStaticMethos psm= new PublicStaticMethos();
		
		psm.publi();		
	}
	
	public void publi1() {
		stat();
	}
	

	

}
