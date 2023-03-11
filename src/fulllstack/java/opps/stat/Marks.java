package fulllstack.java.opps.stat;

public class Marks {
	Subject subject;
	int marks;
	 int totalMarks=100;
	
	public Marks(Subject subject,int marks) {
		this.subject = subject;
		this.marks = marks;
	}
	
	public  void setTotalMarks(int totalMarks) {
		this.totalMarks = totalMarks;
	}
	
	public String toString() {
		return this.subject.name() + " " + this.marks + " " + this.totalMarks;
	}
}
