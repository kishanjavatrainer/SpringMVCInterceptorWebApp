package com.infotech.custom.editor;

import java.beans.PropertyEditorSupport;

public class StudentNameCustomEditor extends PropertyEditorSupport{

	@Override
	public void setAsText(String sudentName) throws IllegalArgumentException {
		if(sudentName != null && !sudentName.isEmpty()){
			setValue(sudentName.toUpperCase());
		}
	}
}
