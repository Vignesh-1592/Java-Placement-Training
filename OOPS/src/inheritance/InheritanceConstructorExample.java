package inheritance;

//class Y{
//	Y(){
//		System.out.println("Y constructor...");
//	}
//}
//
//class Z extends Y{
//	Z(){
//		super();//This is called by itself when it is constructor.
//		System.out.println("Z constructor....");
//	}
//}

class Y{
	Y(int num){
		System.out.println("Y constructor..."+num);
	}
}

class Z extends Y{
	Z(int num){
		super(num);//This is called manually when parameter is passed.
		System.out.println("Z constructor....");
	}
}


public class InheritanceConstructorExample {
	public static void main(String[] args) {
		Z z1 = new Z(20);
	}
}
