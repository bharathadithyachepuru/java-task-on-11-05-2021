package reviews;

class EncapsulationExample{
    private int id;
    private String empName;
    private int empAge;

    
    public int getEmpId(){
        return id;
    }

    public String getEmpName(){
        return empName;
    }

    public int getEmpAge(){
        return empAge;
    }

    public void setEmpAge(int newValue){
        empAge = newValue;
    }

    public void setEmpName(String newValue){
        empName = newValue;
    }

    public void setEmpId(int newValue){
        id = newValue;
    }
}

public class Encapsulation {

	public static void main(String[] args) {
		
		 EncapsulationExample obj = new EncapsulationExample();
         obj.setEmpName("Adithya");
         obj.setEmpAge(25);
         obj.setEmpId(5432);
         
         System.out.println("Employee Name: " + obj.getEmpName());
         System.out.println("Employee Id: " + obj.getEmpId());
         System.out.println("Employee Age: " + obj.getEmpAge());

		

	}

}
