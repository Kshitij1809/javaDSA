package com.cdac.fileIO.writeFile;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class WriteTextFile {
	public static void main(String[] args) {
		
		try (Scanner sc = new Scanner(System.in)){
			//writing into the file
			System.out.println("Enter file name: ");
			String fileName = sc.next();
			
			File file = new File(fileName);
			
			try(FileWriter fw = new FileWriter(file,true);
				PrintWriter pw = new PrintWriter(fw,true);
				){
				
				String text = "";
				while(!text.equals("exit")) {
					sc.nextLine();
					System.out.println("Enter your text: ");
					text = sc.nextLine();
					if ( !text.equals("exit") ) {
						pw.write(text+"\n");						
					}
				}
									
				System.out.println("File Closed.");
			} catch (IOException e) {
				System.err.println(e.getMessage());
			}
		}
		
		System.out.println("File Closed");
	}
}
