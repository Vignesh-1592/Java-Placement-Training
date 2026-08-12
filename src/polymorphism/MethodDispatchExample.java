package polymorphism;

class V1{
	void sendMessage() {
		System.out.println("Message send to 10 members");
	}
}

class V2 extends V1{
	@Override
	void sendMessage() {
		System.out.println("Message send to 20 members");
	}
	
}

public class MethodDispatchExample {
	public static void main(String[] args){
		V1 obj = new V2(); // This method is call dynamic dispatch method --> upcasting
		obj.sendMessage();
	}
}
