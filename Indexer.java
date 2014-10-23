package org.uiowa.cs2820;

import org.uiowa.cs2820.Field;
import org.uiowa.cs2820.Database;

public class Indexer {
	protected String identifier;
	protected boolean closed = false;
	
	public Indexer(String identifier){
		this.identifier = identifier;
	}
	
	public void add(Field f) throws Exception{
		if(this.closed)
			throw new Exception("Cannot add to a closed Indexer");
		Database.insert(this.identifier, f.getFieldName(), f.getFieldValue());
	}
	
	public void close(){
		this.closed = true;
	}
}
