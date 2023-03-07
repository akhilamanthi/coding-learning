package com.practice.functions;

public class Duplicatecount {
public static void main(String[] args) {
	int value1=getDuplicateValues();
	int value2=0;
	getDuplicateValues(value1, value2);
	System.out.print(value2);
}
public static int getDuplicateValues(int value1,int value2) {
	int[]a1= {1,2,3,4,5,7,9};
	int[]a2= {3,4,8,12,14,6,7};
	for(int i=0;i<a1.length;i++) {
		for(int j=0;j<a2.length;j++) {
			if(a1[i]==a2[j]) {
				System.out.print(value2);

			}
		}
	}
	return 0;
}
}
