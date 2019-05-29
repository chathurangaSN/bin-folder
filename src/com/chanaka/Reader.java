package com.chanaka;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Reader{
	
	public void write() throws IOException {
		
		FileWriter fileWriter = new FileWriter("/home/user/java/aaaa.txt");
		BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
		
		
		for (int i = 0; i < 10; i++) {
			bufferedWriter.write("Chanaka " +i+"\n");	
		}
		
		bufferedWriter.close();
		
	}
	
public void read () throws IOException{
		
		FileReader fileReader = new FileReader("/home/user/java/aaaa.txt");
		BufferedReader bufferedReader = new BufferedReader(fileReader);
		
		String line;
		
		while ((line = bufferedReader.readLine())!= null) {
			System.out.println(line);
		}
		
		bufferedReader.close();
		
	}
	
	
}
