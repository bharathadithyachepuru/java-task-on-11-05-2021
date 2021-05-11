package reviews;

public class Trycatchblock {

	public static void main(String[] args) {

		int a=10,b=0,c;
	       int d[]=new int[3];
	        try
	        {
	        d[3]=55;
	         c=a/b;
	       }
	       catch(ArithmeticException e)      {
	           System.out.println("Exception is caught");
	 }
	       catch(ArrayIndexOutOfBoundsException f)
	       {
	           System.out.println("Exception caught for array");

	        }         

	}

}
