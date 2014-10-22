package org.uiowa.cs2820.engine;

import java.util.*;

public class Database {
	 
	// create ArrayList to store information
	private static ArrayList<String> storage = new ArrayList<String>();
	
	
	public static ArrayList<String> getStorage() {
		return storage;
	}

	public static void setStorage(ArrayList<String> storage) {
		Database.storage = storage;
	}

	public static void insert(String identifier, String fieldName, String fieldValue) {
		String record = identifier + " " + fieldName + " " + fieldValue;
		// only add the record if it is not already contained in the list
		if (Database.storage.contains(record) == false) {
			Database.storage.add(record);
		}
	}
	
	public static String search(String fieldName, String fieldValue) {
		//String identifiers = new String();
		String identifiers = "";
		for (String s : Database.storage) {
			String[] recordArray = s.split("\\s+");
			if (fieldName.equals(recordArray[1]) && fieldValue.equals(recordArray[2])) {
				System.out.println("in initial if");
				if (identifiers == "") {
					
					identifiers = recordArray[0];
				} else {
					identifiers = " " + recordArray[0];
				}		
			}
		}
		return identifiers;
	}
	
	public static int size() {
		return Database.storage.size();
	}

	public static String arrayListToString() {
		String contents = new String();
		for (String s : Database.storage) {
			contents = contents + s;
		}
		return contents;
		
	}

	
/*	
	public static void main(String[] args) {
		Database.insert("doc1", "part", "nail");
		Database.insert("doc1", "part", "nail");
		Database.insert("doc2", "partNo", "1234");
		System.out.println(Database.size());
		//System.out.println(Database.toString());
		System.out.println(Database.search("part", "nail"));
		System.out.println(Database.search("partNo", "nail"));
		System.out.println(Database.search("partNo", "1234"));
	}
*/
}
