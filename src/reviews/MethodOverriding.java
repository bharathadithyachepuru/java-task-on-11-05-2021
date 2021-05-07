package reviews;

class oops {
	
	public void part() {
		
		System.out.println("oops concept");
	}
}

public class MethodOverriding extends oops {
	
	public void part() {
		
		System.out.println("Method Overriding is a part of oops ");
	}

	public static void main(String[] args) {
		
		MethodOverriding meth = new MethodOverriding();
		
		meth.part();

	}

}
