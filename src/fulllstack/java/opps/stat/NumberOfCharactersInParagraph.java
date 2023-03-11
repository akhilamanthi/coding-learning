package fulllstack.java.opps.stat;
public class NumberOfCharactersInParagraph {
	public static void main(String[] args) {
		int count=0;
		String Paragraph="Life is a single word with many different connotations"
				+ " and meanings. Above all, life is about more than just being;"
				+ " it's also about how one defines that existence. As a result,"
				+ " it's vital to think about life from several angles. Philosophers,"
				+ " academics, poets, and authors have written extensively about what it means"
				+ " to live and, more significantly, what are the essential elements that characterize ";
		for(int i=0;i<Paragraph.length();i++) {
				count=count+1;
		}
		System.out.println("The number of characters in aGiven paragraph is " +count);
		}
}