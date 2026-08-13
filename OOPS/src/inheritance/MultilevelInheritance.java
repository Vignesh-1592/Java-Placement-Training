package inheritance;

class A{

	int num1;

	int add(int a,int b) {

		return a+b;

	}

}



class B extends A{

	int num2;

	int mul(int a,int b) {

		return a*b;

	}

}



class C extends B{

	void calc() {

		super.num1=10;

		super.num2=20;

		System.out.println("Addition:" + super.add(num1, num2));

		System.out.println("Product:" + super.mul(num1, num2));

		

		

	}

}



public class MultilevelInheritance {



	public static void main(String[] args) {

		

		C b7=new C();

		b7.calc();

//		B b2=new B(); 

//		b2.calc() calc call pana mudiyadhu because its inherited only from A and not from C

	}



}

