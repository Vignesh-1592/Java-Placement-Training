package inheritance;

class Head{

	String headOffice="ABC Street,SREC nagar,Delhi";

	void display() {

		System.out.println("Hello");

	}

}



class ChennaiOfc extends Head{

	void ChennaiOfcReport() {

		System.out.println("Head Office Location:"+ super.headOffice);

		System.out.println("Today Chennai Report");

	}

}



class CoimbatoreOfc extends Head{

	void cbeOfc() {

		System.out.println("Head Office Location"+ super.headOffice);

		System.out.println("Today Coimbatore Report");

	}

}



public class HierarchyInheritance {



	public static void main(String[] args) {

	

		CoimbatoreOfc c1=new CoimbatoreOfc();

		c1.cbeOfc();

		ChennaiOfc c2=new ChennaiOfc();

		c2.ChennaiOfcReport();

	}



}
