package reviews;

class Arts {
	
	public void drawing() {
		
		System.out.println("I am intrested");
	}
}

public class DynamicBinding extends Arts {
	
	public void drawing() {
		
		System.out.println("But i dont know how to draw");
	}

	public static void main(String[] args) {
		
		Arts ar = new DynamicBinding();
		
		Arts ar1 = new Arts();
		
		ar.drawing();
		ar1.drawing();

		

	}

}
