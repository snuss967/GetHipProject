package com.gallup.additionalItems;

public class Success {
	
	public Success(boolean success, String message)
	{
		this.success = success;
		this.message = message;
	}
	private boolean success;
	private String message = "Error";
	
	public String getMessage()
	{
		return message;
	}
	
	public boolean getSuccess()
	{
		return success;
	}
}
