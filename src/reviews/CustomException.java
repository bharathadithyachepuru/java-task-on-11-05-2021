package reviews;

//Custom Exception or User defined exception

class MyException extends Exception {
	   
	String str1;
	
	 MyException(String str2) {
			str1=str2;
		   }
		   public String toString(){ 
			return ("MyException Occurred: "+str1) ;
		   }
		}

public class CustomException {

	public static void main(String[] args) {
		
		try {
			
		System.out.println("Starting of try block");
			
		throw new MyException("This is my error message");
		} 
		
		catch (MyException e) {
			
			System.out.println("Catch block");
			
			System.out.println(e);
			
		}

		

	}

}
