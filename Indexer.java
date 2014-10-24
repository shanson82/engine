package org.uiowa.cs2820.engine;

import org.uiowa.cs2820.engine.Field;
import org.uiowa.cs2820.engine.Database;

public class Indexer {
	protected String identifier;
	protected boolean closed = false;
	
	public Indexer(String identifier){
		this.identifier = identifier;
	}
	
	public String getIdentifier(){
		return this.identifier;
	}
	
	public boolean isClosed(){
		return this.closed;
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
