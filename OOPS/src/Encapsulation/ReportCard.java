package Encapsulation;

public class ReportCard {
	private int rollno;
	private String name;
	private int m1;
	private int m2;
	private int m3;
	private int m4;
	private int m5;
	private int total;
	private float avg;
	private String grade;
	static String schoolName;
	
	
	
	public ReportCard(int rollno, String name, int m1, int m2, int m3, int m4, int m5) {
		this.rollno = rollno;
		this.name = name;
		this.m1 = m1;
		this.m2 = m2;
		this.m3 = m3;
		this.m4 = m4;
		this.m5 = m5;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getM1() {
		return m1;
	}

	public void setM1(int m1) {
		this.m1 = m1;
	}

	public int getM2() {
		return m2;
	}

	public void setM2(int m2) {
		this.m2 = m2;
	}

	public int getM3() {
		return m3;
	}

	public void setM3(int m3) {
		this.m3 = m3;
	}

	public int getM4() {
		return m4;
	}

	public void setM4(int m4) {
		this.m4 = m4;
	}

	public int getM5() {
		return m5;
	}

	public void setM5(int m5) {
		this.m5 = m5;
	}

	public int getTotal() {
		return total;
	}


	public float getAvg() {
		return avg;
	}

	

	public String getGrade() {
		return grade;
	}

	

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	void calcResult() {

		total=m1+m2+m3+m4+m5;

		avg=total/5;

		   if (avg >= 90) {

	            grade = "A";

	        } else if (avg >= 80) {

	            grade = "B";

	        } else if (avg >= 70) {

	            grade = "C";

	        } else if (avg >= 60) {

	            grade = "D";

	        } else {

	            grade = "F";

	        }

		

	}

	

	void getDetails() {

		System.out.println(this.rollno+" "+this.name+" "+this.total+" "+this.avg+" "+this.grade);

		

	}
}

// Bundling of fields and method inside a class is called encapsulation.


