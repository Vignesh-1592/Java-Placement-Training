package abstraction;


public class AbstractionClassExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator c1 = new Calculator();
		int a = c1.add(20, 30);
		System.out.println(a);
		
	//	Arithmetic a = new Arithmetic() --> cant create object for abstract class.
		c1.display();
	}

}
