package reviews;


class Games {
	
	public static void cricket() {
		
		System.out.println("I like it");
	}
}

public class StaticBinding extends Games {
	
	public static void cricket() {
		
		System.out.println("I wish to play");
	}

	public static void main(String[] args) {
		
		Games game = new StaticBinding();
		
		Games game1 = new Games();
		
		game.cricket();
		
		game1.cricket();


	}

}
