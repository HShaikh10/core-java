package com.corejava;

import java.io.File;
import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.*;
import java.util.*;

/**
 * This class is used for myTestFile Read File Example
 * @author Hasnain
*/

public class GFG {
	public static List<String> readFileInList(String fileName) {

		List<String> lines = Collections.emptyList();
		try {
			lines = Files.readAllLines(Paths.get(fileName), StandardCharsets.UTF_8);
		}

		catch (IOException e) {

			e.printStackTrace();
		}
		return lines;
	}

	public static void main(String[] args) {
		List list = readFileInList("D:\\Sample\\core-java\\CoreJava\\TestFile.txt");

		Iterator<String> itr = list.iterator();
		while (itr.hasNext())
			System.out.println(itr.next());
	}
	
}