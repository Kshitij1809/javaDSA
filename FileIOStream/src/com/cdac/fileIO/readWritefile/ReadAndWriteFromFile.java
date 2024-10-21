package com.cdac.fileIO.readWritefile;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ReadAndWriteFromFile {

	public static void main(String[] args) {
		/*
		 * reading from file and then writing on other file
		 * file path example: E:/javatextfiles/<filename>
		*/
		try(Scanner sc = new Scanner( System.in )){
			
			System.out.println("Enter your file path to read from: ");
			String filePathReadFrom = sc.next();
			
			System.out.println("Enter your file path to write on: ");
			String filePathWriteTo  = sc.next();
			
			try(
				BufferedReader br = new BufferedReader(new FileReader( filePathReadFrom ));
				BufferedWriter bw = new BufferedWriter( new FileWriter( filePathWriteTo ));
				PrintWriter pwi = new PrintWriter(bw,true);
				){
					
				String text = "";
				while ( (text = br.readLine()) != null ) {  // reading from file
					pwi.write(text + "\n");                 // writing on file
				}
				
			} catch (IOException e) {
				System.err.println(e.getMessage());
			}
		}
		System.out.println("File closed");

	}

}
