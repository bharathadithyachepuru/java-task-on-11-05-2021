package reviews;

class polymorphism {
	
	public void extension() {
		
		System.out.println("Header part");
	}
}

public class RuntimePolymorphism extends polymorphism {
	
	public void extension() {
		
		System.out.println("Sub part");
	}

	public static void main(String[] args) {
		
		polymorphism pl  = new RuntimePolymorphism();
		
		pl.extension();

	}

}
