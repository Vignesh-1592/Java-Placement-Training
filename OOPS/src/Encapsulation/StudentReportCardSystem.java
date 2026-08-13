package Encapsulation;

public class StudentReportCardSystem {
	public static void main(String[] args) {
		ReportCard r1 = new ReportCard(158,"Vicky", 98, 87, 88, 70, 85);
//		r1.setM1(90);
//		r1.setM2(100);
//		r1.setM3(89);
//		r1.setM4(79);
//		r1.setM5(87);
//		r1.setName("Vicky");
//		r1.setRollno(158);
		r1.calcResult();
		r1.getDetails();
		
	}
}
