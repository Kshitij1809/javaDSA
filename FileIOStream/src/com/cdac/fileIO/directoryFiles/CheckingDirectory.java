package com.cdac.fileIO.directoryFiles;

import java.io.File;
import java.util.Scanner;

public class CheckingDirectory {
	public static void main(String[] args) {
		
		try(Scanner sc = new Scanner(System.in)){
			
			System.out.println("Enter file or folder path: ");
			String fPath = sc.nextLine();
			
			File file = new File(fPath);
			
			//checking if it's a directory
			if ( file.isDirectory() ) {
				String [] files = file.list();
				
				System.out.println("Print the files:- ");
				
				//print the files and folders 
				for(String str:files) {
						System.out.println(str);
				}	
			}
			
			//checking if it's a file
			if ( file.isFile() ) {
				System.out.println("its a file.");
			}
			
		}
	}
}
