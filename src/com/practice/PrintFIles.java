package com.practice;

import java.io.File;

public class PrintFIles {
	public static void main(String args[]) {
		String path= "/home/siva/AkhilaPractice";
		printFilesLoop(path);
		System.out.println("========================");
		printFilesRec(path);
		
	}
	
	static void printFilesRec(String path){
		File directory= new File(path);
		File[] files = directory.listFiles();
		for(int i=0;i<files.length;i++) {
			System.out.println(files[i].getName());
			if(files[i].isDirectory()) {
				printFilesRec(path+"/"+files[i].getName());
			}
		}
	}
	
	static void printFilesLoop(String path){
		File directory= new File(path);
		File[] files = directory.listFiles();
		for(int i=0;i<files.length;i++) {
			System.out.println(files[i].getName());
			if(files[i].isDirectory()) {
				String newPath=path+"/"+files[i].getName();
				File directory1= new File(newPath);
				File[] files1 = directory.listFiles();
				for(int j=0;j<files1.length;j++) {
					System.out.println(files1[j].getName());
				}
			}
		}
	}
}
