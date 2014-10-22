package org.uiowa.cs2820.engine;

import static org.junit.Assert.*;

import org.junit.Test;

public class DatabaseTest {
	/*
	@Test
	public void test() {
		fail("Not yet implemented");
	}
	*/
	// insert one Field and identifier and check 
	@Test
	public void test1() {
		Database.insert("doc1", "part", "nail");
		assertEquals(Database.arrayListToString(), "doc1 part nail");
	}
	
	// insert multiple of the same Field and identifier, make sure it only appears once
	@Test
	public void test2() {
		Database.insert("doc1", "part", "nail");
		Database.insert("doc1", "part", "nail");
		assertEquals(Database.size(), 1);		
	}
	
	// insert one Field and identifier
	// perform search and assert that returned identifier matches inputted identifier
	@Test
	public void test3() {
		Database.insert("doc2", "partID", "123abc");
		assertEquals(Database.search("partID", "123abc"), "doc2");
		
	}
	
	// insert multiple of same Field with same identifier
	// search and assert that only one identifier is returned
	// This test might be redundant to what test2 covers
	@Test
	public void test4() {
		Database.insert("doc3", "partID", "900");
		Database.insert("doc3", "partID", "900");
		Database.insert("doc3", "partID", "900");
		assertEquals(Database.search("partID", "900"), "doc3");
	}
	
	// insert multiple of same Field with different identifiers
	// search for Field and assert inputted identifiers match returned identifiers
	@Test
	public void test5() {
		Database.insert("doc4", "part", "hammer");
		Database.insert("doc5", "part", "hammer");
		Database.insert("doc6", "part", "hammer");
		assertEquals(Database.search("part","hammer"), "doc4 doc5 doc6");
		
	}
	
	// search for a fieldValue, fieldName pair that doesn't exist
	// assert that the empty string is returned
	@Test
	public void test6() {
		Database.insert("doc7", "part", "screwdriver");
		assertEquals(Database.search("part","screwdrivers"), "");
	}
	
}
