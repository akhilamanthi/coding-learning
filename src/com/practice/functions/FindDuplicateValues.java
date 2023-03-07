package com.practice.functions;

public class FindDuplicateValues {
public static void main(String[] args) {
	findDuplicateValues();
}
public static int findDuplicateValues() {
	int[] num = {123,420,986,689,600,725};
	int preivousSum=0;
	for( int i=0;i<num.length;i++) {
		int j=num[i];
		int sum=0;
		int currentNumber=j;
		for(;j>0;) {
			int	quotient=j/10;
			int remainder=j%10;
			sum=sum+remainder;
			j=quotient;
		}
		System.out.println("The num array values" +num[i]);
		System.out.println("The sum of digits is " +sum);
		if(sum==preivousSum) {
			System.out.println("Duplicate sum"+sum);
			preivousSum=sum;
			System.out.println("The Duplicate value is "+currentNumber);
		}
	preivousSum=sum;
	}
	return 0;
}
}
