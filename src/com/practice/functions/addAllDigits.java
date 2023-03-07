package com.practice.functions;

public class addAllDigits {
public static void main(String[] args) {
	addAllNum();
}
public static int addAllNum() {
	int sum=0;
	int[] num = {123,420,986,689,600,725};
	for( int i=0;i<num.length;i++) {
		for(int j=num[i];j>0;) {
			int	quotient=i/10;
			int remainder=i%10;
			sum=sum+remainder;
			System.out.println("The sum of digits is " +sum);
			i=quotient;
		}
	}
	return sum;
}
}
