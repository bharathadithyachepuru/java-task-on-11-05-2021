package reviews;

interface A
{
	void m1();
}
interface B
{
	void m1();
	}
class C implements A,B
{
	public void m1() {
		System.out.println("Difficult Subject");
	}}
public class InterfaceExample {

	public static void main(String[] args) {
		
		C c1=new C();
		c1.m1();
		
	}
		
}


