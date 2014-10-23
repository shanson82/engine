package org.uiowa.cs2820;

import static org.junit.Assert.*;

import org.junit.Test;

public class IndexerTest {
	public IndexerTest(){}

	@Test
	public void testAdd(){
		Indexer I = new Indexer("someIdentifier");
		try{I.add(new Field("someFieldName", "someFieldValue"));}
		catch(Exception e){fail("Exception thrown by add()");}
	}
	
	@Test
	public void testClose(){
		Indexer I = new Indexer("someIdentifier");
		try{
			I.close();
			I.add(new Field("someFieldName", "someFieldValue"));
			fail("Successfully written to closed Indexer");
		}catch(Exception e){}
	}

}
