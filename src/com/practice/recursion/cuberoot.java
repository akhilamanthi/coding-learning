package com.practice.recursion;
import java.util.Scanner;
public class cuberoot {
public static void main(String[] args) {
    int k=0,n=0,nthPowerOfK=1;

    System.out.print("Enter your cube number\n");
    Scanner sc = new Scanner(System.in);
    n = sc.nextInt();
    k= sc.nextInt();
     for(int i=0;i<n;i++){
    	 nthPowerOfK=(nthPowerOfK*k);
    }
     System.out.print(k+" To the power of"+n+" is " +nthPowerOfK);
}
}
