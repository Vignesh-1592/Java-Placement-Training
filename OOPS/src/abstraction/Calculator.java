package abstraction;

class Calculator extends Arithmetic{

	@Override
	int add(int a, int b) {
		// super.display(); --> to call the non static method in abstract class
		return a+b;
	}

	@Override
	int sub(int a, int b) {
		// super.display(); --> to call the non static method in abstract class
		return a-b;
	}
	
}