package org.uiowa.cs2820.engine;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;

public class IndexerTest {
	public Indexer I;
	public IndexerTest(){}
	
	@Before
	public void before(){
		I = new Indexer("someIdentifier");
	}
	
	@After
	public void after(){
		I = null;
	}
	
	@Test
	public void testIsClosed(){
		assertFalse("isClosed() returned true before close",I.isClosed());
		try{I.add(new Field("someFieldName", "someFieldValue"));}
		catch(Exception e){fail("Exception thrown by add()");}
		assertFalse("isClosed() returned false after add but before close",I.isClosed());
		I.close();
		assertTrue("isClosed() returned false after close",I.isClosed());
	}
	
	@Test
	public void testGetIdentifier(){
		assertEqual("Expected 'someIdentifier'",I.getIdentifier(),"someIdentifier");
		Indexer I2 = new Indexer("someOtherIdentifier");
		assertEqual("Expected 'someOtherIdentifier'",I2.getIdentifier(),"someOtherIdentifier");
	}

	@Test
	public void testAdd(){
		try{I.add(new Field("someFieldName", "someFieldValue"));}
		catch(Exception e){fail("Exception thrown by add()");}
	}
	
	@Test
	public void testClose(){
		try{
			I.close();
			I.add(new Field("someFieldName", "someFieldValue"));
			fail("Successfully written to closed Indexer");
		}catch(Exception e){}
	}

}
