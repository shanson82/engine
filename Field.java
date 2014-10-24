package org.uiowa.cs2820.engine;

public class Field {
	private String myFieldName;
	private String myFieldValue;
	
	public Field(String FieldName, String FieldValue) throws Exception{
		this.myFieldName = FieldName;
		this.myFieldValue = FieldValue;
	    }
	public String getFieldName() {
	    return myFieldName;  
	    }
	public String getFieldValue() {
		return myFieldValue;
	    }
	}