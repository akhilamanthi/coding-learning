package fulllstack.java.opps.stat;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MyArrayList {
	public static void main(String[] args) {
		setArrayList();
		setLinkedList();
	public static void setArrayList() {
			ArrayList<String> nameList = new ArrayList<String>(5);
			nameList.add("Akhila");
			nameList.add("Divya");
			nameList.add("Teja");
			nameList.add("Janu");
			nameList.add("Lavanya");
			nameList.add("Kusuma");
			System.out.println(nameList.toString());
			LinkedList<String> namesLinkedList = new LinkedList<>();
			namesLinkedList.add("Akhila");
			namesLinkedList.add("Divya");
			namesLinkedList.add("Teja");
			namesLinkedList.add("janu");
			namesLinkedList.add("Lavanya");
			namesLinkedList.add("Kusuma");
			System.out.println(namesList.toString());
			
	}
}
