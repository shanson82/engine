package org.uiowa.cs2820.engine;

public class Field {
	String myFieldName;
	String myFieldValue;
	
	Field(String FieldName, String FieldValue){
		this.myFieldName = FieldName;
		this.myFieldValue = FieldValue;
		return;
	    }
	String getFieldName() {
	    return myFieldName;  
	    }
	String getFieldValue() {
		return myFieldValue;
	    }
	}