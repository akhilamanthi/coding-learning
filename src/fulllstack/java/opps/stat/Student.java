package fulllstack.java.opps.stat;

public class Student {

	{
		System.out.println("Executing normal block");
	}	
	static {
		System.out.println("Executing static block");
	}
		int  id = 123;
		String name = "Siva";
		static String COLLEGE_NAME = "Vishnu";
		
		public static String getCollegeName() {
				return COLLEGE_NAME;
		}
		
		public String getName() {
			return this.name;
		}
		public String getCOllegeName2() {
			return COLLEGE_NAME;
		}
		
}
