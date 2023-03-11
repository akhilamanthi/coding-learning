package fulllstack.java.opps.stat;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class collectionTest{
		 static  void testListSetMap() {
			List<String> namesList = new ArrayList<>(10);	
			namesList.add("Akhila");
			namesList.add("Syamala");
			namesList.add("Murali");
			namesList.add("Raja");
			namesList.add("Siva");
			namesList.add("Siva");
			Set<String> namesSet=new HashSet<>();
			namesSet.add("Syamala");
			namesSet.add("Akhila");
			namesSet.add("Syamala");
			namesSet.add("Murali");
			namesSet.add("Raja");
			namesSet.add("Siva");
			namesSet.add("Siva");
			HashMap<String,Integer> namesMap = new HashMap<>();//Name-Age
			namesMap.put("Akhila",20);
			namesMap.put("Siva",31);
			namesMap.toString();
			namesSet.toString();
			System.out.println(namesList.toString());
			System.out.println(namesMap.toString());
			System.out.println(namesSet.toString());

		}
	
		public  static void main(String[] args) {
			testListSetMap();
		}
		
		}	
	
	


