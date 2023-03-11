package fulllstack.java.opps.stat;
public class StaticPractice {
		 static public void main(String args[]) {
			//dESCRIBE STATIC PROPERTY ACCESSIBILITY
			Student s = new Student();
			System.out.println("Stundet Id " + s.id);
			System.out.println("Stundet Id " + s.COLLEGE_NAME);
			Student s1 = new Student();
			Student s3 = new Student();
			Student s4 = new Student();
			Student s5 = new Student();
			//Static method accessibility
			System.out.println("Priting college name by calling method " + Student.getCollegeName());		
			System.out.println("Priting college name by calling method " + s.getCollegeName());
			System.out.println("Priting student name by calling method " + s.getName());
			}
}
