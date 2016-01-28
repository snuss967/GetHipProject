package com.gallup.gethip.model;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

@XmlRootElement
@DatabaseTable(tableName="securityquestions")
public class SecurityQuestions {
	
	@DatabaseField(generatedId = true, columnName = "ID")
	private int ID;
	
	@DatabaseField(columnName = "SecurityQuestion", width = 100)
	private String SecurityQuestion;
	

	
	public SecurityQuestions(){
		
	}

	public int getID() {
		return ID;
	}

	public void setID(int ID) {
		this.ID = ID;
	}

	public String getSecurityQuestion() {
		return SecurityQuestion;
	}
	
	public void setSecurityQuestion(String SecurityQuestion) {
		this.SecurityQuestion = SecurityQuestion;
	}
}
