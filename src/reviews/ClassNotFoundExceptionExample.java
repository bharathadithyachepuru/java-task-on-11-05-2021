package reviews;

public class ClassNotFoundExceptionExample {

	public static void main(String[] args) {

		try
	    {
	      Class.forName("NoClassExist");
	    }
	    catch (ClassNotFoundException ex)
	    {
	      ex.printStackTrace();
	    }

	}

}
