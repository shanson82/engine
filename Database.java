// Steve Hanson
// Team 6: group members: Clement Yan, JoonYoung Kwon, Anu Ghimire

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
	
	// method to format the concatenation of a String object
	private static String concatenateString(String master, String newStr) {
		if (master.equals("")) {
			return newStr;
		} 	else if (newStr.equals("")) {
			return master;
		}	else {
			return master + " " + newStr;
		}
	}

	// method to add a "record" to the ArrayList storage
	// a record is a String object made up of the identifier, fieldName, and fieldValue
	public static void insert(String identifier, String fieldName, String fieldValue) {
		String record = identifier + " " + fieldName + " " + fieldValue;
		// only add the record if it is not already contained in the list
		if (Database.storage.contains(record) == false) {
			Database.storage.add(record);
		}
	}
	
	// method to search the database
	// takes in a fieldName and fieldValue and returns a String object with any identifiers containing the fieldName and fieldValue
	public static String search(String fieldName, String fieldValue) {
		String identifiers = "";
		for (String s : Database.storage) {
			String[] recordArray = s.split("\\s+");
			if (fieldName.equals(recordArray[1]) && fieldValue.equals(recordArray[2])) {
				// use concatenateString to format the String object
				identifiers = concatenateString(identifiers, recordArray[0]);
			}
		}
		return identifiers;
	}
	
	
	// returns the size of the data structure
	public static int size() {
		return Database.storage.size();
	}


	// convert the contents of the ArrayList to a String object
	public static String arrayListToString() {
		String contents = "";
		for (String s : Database.storage) {
			// use concatenateString method to format the string
			contents = concatenateString(contents, s);
		}
		// returns a String object containing the contents of storage
		return contents;
		
	}
}
