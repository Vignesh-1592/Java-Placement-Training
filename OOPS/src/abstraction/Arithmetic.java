package abstraction;

abstract class Arithmetic{
	// in abstract class we can keep both abstract and non- abstract methods
	abstract int add(int a, int b);
	
	abstract int sub(int a, int b);
	void display() {
		System.out.println("Hello buddies!");
	}
}
