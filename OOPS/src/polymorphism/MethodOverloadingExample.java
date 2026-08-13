package polymorphism;

class Arithmetic{
	int add(int a,int b) {
		return a+b;
		
	}
	int add(int a, int b, int c) {
		return a+b+c;
	}
	
	void signup(String username, String pass, String name, String address) {
		// create a new account code here
	}
	
	void signup(String googleToken) {
		// Sign up with google navigation code here
	}
}

public class MethodOverloadingExample {

	public static void main(String[] args) {
		Arithmetic obj = new Arithmetic();
		System.out.println(obj.add(10,20));
		System.out.println(obj.add(10,20,30));
	}
}