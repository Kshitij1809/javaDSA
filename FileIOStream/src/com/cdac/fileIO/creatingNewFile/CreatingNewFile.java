package com.cdac.fileIO.creatingNewFile;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class CreatingNewFile {

	public static void main(String[] args) {
		
		try(Scanner sc = new Scanner(System.in)){
			System.out.println("Enter the path where you want to create a file or folder: ");
			String filePath = sc.nextLine();
			System.out.println("Enter file or folder name: ");
			String fileName = sc.next();
			
			File file = new File(filePath + "/" + fileName);
			
			System.out.println("Enter your choice: ");
			System.out.println("1. Create File ");
			System.out.println("2. Create Folder ");
			int choice = sc.nextInt();
			
			
			switch( choice ) {
				case 1:{
					if ( file.exists() ) {
						System.out.println("file alrady exists");
						break;
					}
					
					try {
						file.createNewFile();
						System.out.println("File Created !");
					} catch ( IOException e ) {
						System.err.println("File not created.");
					}
					
				}break;
				
				case 2:{
					if ( file.exists() ) {
						System.out.println("Folder alrady exists");
						break;
					}
					
					file.mkdir();
					System.out.println("Folder Created !");
				}break;
				
				default:{
					System.out.println("Invalid Input");
				}
				
			}
			System.out.println("File closed");
		}

	}

}
