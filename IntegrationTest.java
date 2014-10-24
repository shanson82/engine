package org.uiowa.cs2820.engine;

import static org.junit.Assert.*;

import org.junit.Test;
import org.uiowa.cs2820.engine.Field;
import org.uiowa.cs2820.engine.FieldSearch;
import org.uiowa.cs2820.engine.Indexer;

public class IntegrationTest {

	@Test
	public void test() throws Exception {
		Field fieldName1 = new Field("Anu","211");
		Indexer indexer1 = new Indexer("File1");
		
		indexer1.add(fieldName1);
		FieldSearch myFS = new FieldSearch();
		assertEquals(myFS.findEquals(fieldName1)[0],"File1");
					
	}
	//
	@Test
	public void test2() throws Exception {
		Field fieldName1 = new Field("Anu","211");
		
		Indexer indexer1 = new Indexer("File1");
		Indexer indexer2 = new Indexer("File2");
		
		indexer1.add(fieldName1);
		indexer2.add(fieldName1);
		
		FieldSearch myFS = new FieldSearch();
		assertEquals(myFS.findEquals(fieldName1)[0],"File1");	
		assertEquals(myFS.findEquals(fieldName1)[1],"File2");
	}

}
