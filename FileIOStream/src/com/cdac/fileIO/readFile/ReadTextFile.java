package com.cdac.fileIO.readFile;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ReadTextFile {

	public static void main(String[] args) {
		
		try(Scanner sc = new Scanner(System.in)){
			
			//taking file name
			System.out.println("Enter file name: ");
			String fileName = sc.nextLine();
						
			String text = "";
			
			//reading from file
			try(BufferedReader br = new BufferedReader(new FileReader(fileName));
				PrintWriter pw = new PrintWriter(System.out);
			){
			//printing file content to console
				while ( (text = br.readLine()) != null ) {
					pw.println(text);
				}
				
			}catch ( FileNotFoundException e ) {
				System.err.println(e.getMessage());
			} catch ( IOException e ) {
				System.err.println(e.getMessage());
			}			
		}
	}

}
