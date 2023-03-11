package com.practice.functions;
import com.practice.recursion.MyOwnFunctions;
public class Functionspractise {
public static void main(String[] args) {
	
	doOperationAndPrintValue(3, 3,1);
	doOperationAndPrintValue(3, 3,2);
	doOperationAndPrintValue(3, 3,3);
	doOperationAndPrintValue(3, 3,4);
	doOperationAndPrintValue(5, 6, 5);
	//x=(a*a)+b;
	//A=(a^2+b^2+2ab)		
	//Operation-1 addition, 2-subtraction ,3-mul,4-division,5-a+b whole squre

}

public static void doOperationAndPrintValue(int a, int b,int operation) {
	int valueHolder=0;
	switch (operation) {
	case 1:
		valueHolder=addition(a, b);
		break;
	case 2:
		valueHolder=subtraction(a, b);
		break;
	case 3:
		valueHolder=priceCalculation(a, b);
		break;
	case 4:
		valueHolder=divide(a, b);
		break;
	case 5:
		valueHolder=aPlusbWholeSquare(a, b);
		break;

	default:
		break;
	}
	MyOwnFunctions.printLine(valueHolder);
}
public static int addition(int a,int b) {
	return a+b;
}
public static int subtraction(int a,int b) {
	return a-b;
}
public static int divide(int a,int b) {
	return a/b;
}
public static int priceCalculation(int qty,int price) {
	int sub= qty*price;
	return sub;
}

/**
 * calculate x value for formula x=(a*a)+b
 * @return
 */
public static int findXvalue(int a, int b) {
	int x=0;
	int asquare=priceCalculation(a,a);
	x=addition(asquare, b);
	MyOwnFunctions.printLine(x);
	return x;
}
public static int aPlusbWholeSquare(int a,int b) {
	int A=0;
	int asquare=priceCalculation(a,a);
	int bsquare=priceCalculation(b,b);
	int ab =priceCalculation(a,b);
	int ab2= priceCalculation(2, ab);
	int asquarePlusBsqure=addition(asquare,bsquare);
	int aPlusBWholeSquare=addition(asquarePlusBsqure, ab2);
	return aPlusBWholeSquare;
	
}
}


	
