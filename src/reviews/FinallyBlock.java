package reviews;

public class FinallyBlock {

	public static void main(String[] args) {

		int a=10,b=0,c;
		
		 int d[]=new int[3];
	        try
	        {
	          d[4]=55;
	         }
	       catch(ArrayIndexOutOfBoundsException f)
	       {
	           System.out.println("Exception caught for array");
	      }
	    finally
	    {
	  System.out.println("Finally block");
	        }

	}

}
