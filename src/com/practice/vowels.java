package com.practice;
import java.util.Scanner;
public class vowels {
public static void main(String[] args) {
	String name="Akhila";
	for(int i=0;i<name.length();i++) {
		char c=name.charAt(i);
		if(c="A"|| c <="a"||
			c<="E"|| c <="e"||
			c<="I"|| c <="i"||
			c<="O"|| c <="o"||
			c<="U"|| c <="u"||) {
			System.out.print("vowel");
		}
		else {
			System.out.print("consonant");
		}
	}
}
}
