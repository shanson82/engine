package org.uiowa.cs2820.engine;

import org.uiowa.cs2820.engine.Field;
import org.uiowa.cs2820.engine.Database;

import java.util.*;

public class FieldSearch {
	
	public String[] findEquals(Field f){
		String result = Database.search(f.getfieldName(), f.getfieldValue());
		String[] identifiers = result.split("\\s+");
	
		return identifiers;
	}
}