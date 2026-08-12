package oops;

class StudentReportCard{
	int rollNumber;
	String name;
	int mark1;
	int mark2;
	int mark3;
	int mark4;
	int mark5;
	int total;
	float average;
	String grade;
	
	StudentReportCard(int rollNumber,String name,int mark1,int mark2,int mark3,int mark4,int mark5){
		this.rollNumber = rollNumber;
		this.name = name;
		this.mark1 = mark1;
		this.mark2 = mark2;
		this.mark3 = mark3;
		this.mark4 = mark4;
		this.mark5 = mark5;
	}
	void GetReportCard() {
		System.out.println("Name of the Student: "+this.name);
		System.out.println("Roll Number of the student: "+this.rollNumber);
		int total = this.mark1+this.mark2+this.mark3+this.mark4+this.mark5;
		System.out.println("Total Marks: "+total);
		float average = total/5;
		System.out.println("Average Marks: "+average);
		if(average>85&&average<=100) {
			grade = "A";
		}
		else if(average>70&&average<=85) {
			grade = "B";
		}
		else if(average>50&&average<=70) {
			grade = "C";
		}
		else {
			grade = "F";
		}
		System.out.println("Grade of the Student: "+grade);
		
	}
}

public class StudentReportCardSystem {
	public static void main(String[] args) {
		StudentReportCard s1 = new StudentReportCard(158,"Vignesh",89,93,84,80,95);
		s1.GetReportCard();
		System.out.println(" ");
		StudentReportCard s2 = new StudentReportCard(159, "Vishal", 70,77, 80, 81, 76);
		s2.GetReportCard();
		System.out.println(" ");
		StudentReportCard s3 = new StudentReportCard(160, "Vishnupriya", 85, 84, 90, 83, 90);
		s3.GetReportCard();
		System.out.println(" ");
		StudentReportCard s4 = new StudentReportCard(0, null, 0, 0, 0, 0, 0);
		s4.GetReportCard();
	}
}
