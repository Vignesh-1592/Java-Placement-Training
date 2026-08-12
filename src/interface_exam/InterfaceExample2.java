package interface_exam;


interface GrandParent
{
	void add();
}

interface Parent extends GrandParent
{
	void sub();
}

interface Child extends Parent
{
	void mul();
}

interface Arith extends Child{
	
}

public class InterfaceExample2 {

	public static void main(String[] args) {		
	}

}
