package fulllstack.java.opps.stat;

import java.util.ArrayList;
import java.util.List;

public class StudentMarks {
	String studentname;
	int  id;
	List<Marks> marks;
	
	public StudentMarks(int id,String name) {
		this.id = id;
		this.studentname = name;
		
		
		marks = new ArrayList();
	}
	
	public void setMarks(List<Marks> marks) {
		this.marks = marks;
	}
	
	public void addSubjectMarks(Marks marks) {
		this.marks.add(marks);
	}
	
	
	public String toString() {
		return this.studentname + " " + this.id + " Marks " + this.marks.toString();
	}
}
