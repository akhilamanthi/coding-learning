package com.practice.functions;

import com.practice.recursion.MyOwnFunctions;

public class functionsprac {
public static void main(String[] args) {
	//Operation-1 addition, 2-multiply
	doOperationAndPrintValue(1,3,4);
	doOperationAndPrintValue(2,1,2);
	doOperationAndPrintValue(3,2,2,2);
}
public static void doOperationAndPrintValue(int operation,int a,int b,int ...operands) {
int valueHolder=0;
int c=0;
int a=operands[0];
int b=operands[1];
if(operands.length>2) {
	c=operands[2];

}
switch (operation) {
case 1:
	valueHolder=aplusbformula(a, b);
	break;
case 2:
	valueHolder=aplusb(a, b);
	break;
case 3:
	valueHolder=SquareFormula(a,b,c);
	break;
    default:
    	break;
}
MyOwnFunctions.printLine(valueHolder);
}
public static int addition(int a,int b) {
	int add;
	add= a+b;
	MyOwnFunctions.printLine(a+"+"+b+"=="+add);
	return add;

}

public static int multiply(int a,int b) {
	int mul= a*b;
	MyOwnFunctions.printLine(a+"*"+b+"=="+mul);
	return mul;
}

public static int aplusbformula(int a,int b) {
		int acube= multiply(a,a);
		int bcube=multiply(b,b);
		int asquare=multiply(a,a);
		int aintob=multiply(asquare,b);
		int s=multiply(3,aintob);
		int bsquare=multiply(b,b);
		int  bintoa=multiply(a,bsquare);
		int B=multiply(3,bintoa);
		int StartFormula=addition(acube,bcube);
		int threesquare=addition(s,B);
		int aplusbformula=addition(StartFormula,threesquare);
		return aplusbformula;
}
public static int aplusb(int a,int b) {
	int aplusb=addition(a,b);
	int asquare=multiply(a,a);
	int ab=multiply(a,b);
	int bsquare=multiply(b,b);
	int Q = addition(asquare,ab);
	int asquareplusabplusbsquare=addition(Q,bsquare);
	int Formula = multiply(aplusb,asquareplusabplusbsquare);
	return Formula;
}
public static int SquareFormula(int a,int b,int c) {
	int asquare=multiply(a,a);
	int bsquare=multiply(b,b);
	int csquare=multiply(c,c);
	int absquare=addition(asquare,bsquare);
	int Square = addition(absquare,csquare);
	int ab = multiply(a,b);
	int bc = multiply(b,c);
	int ca = multiply(c,a);
	int abplusbc=addition(ab,bc);
	int abplusbcplusca=multiply(abplusbc,ca);
	int X = multiply(2,abplusbcplusca);
	int total= addition(Square,X);
	return total;
			}
}
