package interface_exam;

//**Java supports multiple inheritance through interface only.**
interface Parent1{
	void display();
}

interface Parent2{
	void display();
}

interface Child1 extends Parent1, Parent2{
	void add();
}

class Calc implements Child1{

	@Override
	public void display() { 
		
	}

	@Override
	public void add() {
		
	}
	
}
public class MultipleInheritanceInterfaceExample {

	public static void main(String[] args) {

	}

}
