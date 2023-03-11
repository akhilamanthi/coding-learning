package fulllstack.java.opps.stat;

public class GradeAssement {

	public static void main(String args[]) {
		
		StudentMarks student = new StudentMarks(123,"Akhila");
		Marks physcicsMarks = new Marks(Subject.PHYSCICS, 80);
		Marks checmistiryMarks = new Marks(Subject.CHEMISTRY, 80);
		Marks maths = new Marks(Subject.MATHS, 80);
		Marks computer = new Marks(Subject.COMPUTERS, 80);
		Marks hindi = new Marks(Subject.HINDI, 80);
		hindi.setTotalMarks(250);
		Marks english = new Marks(Subject.ENGLISH, 80);

		student.addSubjectMarks(checmistiryMarks);
		student.addSubjectMarks(physcicsMarks);
		student.addSubjectMarks(maths);
		student.addSubjectMarks(computer);
		student.addSubjectMarks(hindi);
		student.addSubjectMarks(english);

		System.out.println(student.toString());
	
		physcicsMarks.totalMarks = 150;
		
		System.out.println(student.toString());

		
	}
}
