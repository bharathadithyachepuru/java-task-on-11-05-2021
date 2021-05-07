package reviews;

public class GarbageCollection {

	public static void main(String[] args) {

		GarbageCollection collection = new GarbageCollection();
		
		collection = null;
		
		System.gc();

	}
	
	public void finalize() {
		
		System.out.println("Garbage collected");
		
	}

}
