package com.gallup.additionalItems;

public class Security {
	private String SecurityQuestion;
	private boolean problem;
	private String SecurityQuestionNum;
	private int ID;
	
	public void setSecurityQuestion(String SecurityQuestion)
	{
		this.SecurityQuestion = SecurityQuestion;
	}
	public void setProblem(boolean problem)
	{
		this.problem = problem;
	}
	public String getSecurityQuestion()
	{
		return SecurityQuestion;
	}
	public boolean getProblem()
	{
		return problem;
	}
	public String getSecurityQuestionNum()
	{	
		return SecurityQuestionNum;
	}	
	public void SecurityQuestionNum(String SecurityQuestionNum)
	{
		this.SecurityQuestionNum = SecurityQuestionNum;
	}
	public void setID (int ID)
	{
		this.ID = ID;
	}
	public int getID()
	{
		return ID;
	}
	
}

