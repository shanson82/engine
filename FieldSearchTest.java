package org.uiowa.cs2820.engine;

import static org.junit.Assert.*;

import org.junit.Test;

public class FieldSearchTest {

	@Test
	public void test1() throws Exception {
		FieldSearch T = new FieldSearch();
		String[] result = {"doc1", "doc2"};
		Database.insert("doc1", "part", "nail");
		Database.insert("doc2", "part", "nail");
		assertArrayEquals(T.findEquals(new Field("part","nail")), result);
	}

	@Test
	public void test2() throws Exception {
		FieldSearch T = new FieldSearch();
		String[] result = {"doc1", "doc2", "doc3"};
		Database.insert("doc1", "part", "nail");
		Database.insert("doc2", "part", "nail");
		Database.insert("doc3", "part", "nail");
		assertArrayEquals(T.findEquals(new Field("part","nail")), result);
	}


	@Test
	public void test3() throws Exception {
		FieldSearch T = new FieldSearch();
		String[] result = {"doc1"};
		Database.insert("doc1", "part", "screwdrivers");
		Database.insert("doc2", "hammer", "nail");
		Database.insert("doc3", "hammer", "nail");
		assertArrayEquals(T.findEquals(new Field("part","screwdrivers")), result);
	}
	
	@Test
	public void test4() throws Exception {
		FieldSearch T = new FieldSearch();
		String[] result = {""};
		Database.insert("doc1", "part", "nail");
		Database.insert("doc2", "part", "nail");
		Database.insert("doc3", "part", "nail");
		assertArrayEquals(T.findEquals(new Field("no","result")), result);
	}
}
