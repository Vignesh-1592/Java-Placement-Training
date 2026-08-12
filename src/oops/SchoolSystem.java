package oops;

class Student{
	int rollno;
	String name;
	char gender;
	int age;
	
	void setValues(int rollno, String name, char gender, int age){
		this.rollno = rollno;
		this.name = name;
		this.gender = gender;
		this.age= age;
	}
}
public class SchoolSystem {

	public static void main(String[] args) {
		Student s1 = new Student();
//		s1.rollno = 158;
//		s1.name = "Vicky";
//		s1.gender = 'M';
//		s1.age = 20;
		s1.setValues(158, "Vicky",'M',20);
		System.out.println(s1.rollno +" "+ s1.name +" "+ s1.gender +" "+ s1.age);
	}
}
