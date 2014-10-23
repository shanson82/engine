package org.uiowa.cs2820.engine;

import org.uiowa.cs2820.engine.Field;
import org.uiowa.cs2820.engine.Database;

import java.util.*;

public class FieldSearch {
	
	private Database database;
	protected boolean closed = false;
	
	public FieldSearch(Database database){
		this.Database = database;
		
	}
	
	public void findEquals(Field f) throws Exception{
		if(this.closed)
			throw new Exception("Cannot search");
		Database.search(f.getfieldName(), f.getfieldValue());

	}
}
