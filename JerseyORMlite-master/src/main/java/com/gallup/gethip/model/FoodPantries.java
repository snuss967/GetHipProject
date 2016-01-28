package com.gallup.gethip.model;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

@XmlRootElement
@DatabaseTable(tableName="foodpantries")
public class FoodPantries {
	@DatabaseField(columnName = "ID", id = true, generatedId = true, unique = true)
	private int ID;
	
	@DatabaseField(columnName = "RegistrationDate")
	private Date RegistrationDate;
	
	@DatabaseField(columnName = "PantryContactFirstName", width = 50)
	private String PantryContactFirstName;
	
	@DatabaseField(columnName = "FoodPantry", width = 50)
	private String FoodPantry;
	
	@DatabaseField(columnName = "UserName", width = 50, uniqueCombo = true)
	private String UserName;
	
	@DatabaseField(columnName = "Password", width = 50)
	private String Password;
	
	@DatabaseField(columnName = "PantryContactLastName", width = 50)
	private String PantryContactLastName;
	
	@DatabaseField(columnName = "PantryContactEmail", width = 50, uniqueCombo = true)
	private String PantryContactEmail;
	
	@DatabaseField(columnName = "PantryContactPhone")
	private int PantryContactPhone;
	
	@DatabaseField(columnName = "ConfirmationCodePhysical")
	private int ConfirmationCodePhysical;
	
	@DatabaseField(columnName = "Active")
	private short Active;
	
	@DatabaseField(columnName = "BannedLength")
	private long BannedLength;
	
	@DatabaseField(columnName = "Banned")
	private long Banned;
	
	@DatabaseField(columnName = "SecurityQuestion1")
	private short SecurityQuestion1;
	
	@DatabaseField(columnName = "SecurityQuestion2")
	private short SecurityQuestion2;
	
	@DatabaseField(columnName = "SecurityQuestion3")
	private short SecurityQuestion3;
	
	@DatabaseField(columnName = "SecurityAnswer1", width = 100)
	private String SecurityAnswer1;
	
	@DatabaseField(columnName = "SecurityAnswer2", width = 100)
	private String SecurityAnswer2;
	
	@DatabaseField(columnName = "SecurityAnswer3", width = 100)
	private String SecurityAnswer3;
	
	@DatabaseField(columnName = "Address1", width = 100)
	private String Address1;
	
	@DatabaseField(columnName = "Address2", canBeNull = true, width = 100)
	private String Address2;
	
	@DatabaseField(columnName = "Zip")
	private short Zip;
	
	@DatabaseField(columnName = "State", width = 2)
	private String State;
	//will store the two letters of states
	@DatabaseField(columnName = "City")
	private String City;
	
	public FoodPantries(){
		
	}
	
	public String getAddress2()
	{
		return Address2;
	}
	
	public void setAddress2(String Address2)
	{
		this.Address2 = Address2;
	}
	
	public String getUserName() {
		return UserName;
	}

	public void setUserName(String UserName) {
		this.UserName = UserName;
	}
	
	public String getFoodPantry() {
		return FoodPantry;
	}

	public void setFoodPantry(String FoodPantry) {
		this.FoodPantry = FoodPantry;
	}
	

	public void setID(int ID) {
		this.ID = ID;
	}
	
	public int getID()
	{
		return ID;
	}
	
	public String getPassword() {
		return Password;
	}

	public void setPassword(String Password) {
		this.Password = Password;
	}

	public boolean getActive(){
		if( Active == 0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	public void setActive(boolean Active) {
		if(Active == true)
			this.Active = 0;
		else
			this.Active = 1;
	}	
	
	public void setBanned(boolean Banned) {
		if(Banned == true)
			this.Banned = 0;
		else
			this.Banned = 1;
	}
	
	public boolean getBanned(){
		if( Banned == 0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public int getPantryContactPhone() {
		return PantryContactPhone;
	}

	public void setPantryContactPhone(int PantryContactPhone) {
		this.PantryContactPhone = PantryContactPhone;
	}

	public long getBannedLength() {
		//banned length is in days
		return BannedLength;
	}

	public void setBannedLength(long BannedLength) {
		this.BannedLength = BannedLength;
	}

	public short getSecurityQuestion1() {
		
		return SecurityQuestion1;
	}

	public void setSecurityQuestion1(short SecurityQuestion1) {
		this.SecurityQuestion1 = SecurityQuestion1;
	}

	public short getSecurityQuestion2() {
		return SecurityQuestion2;
	}

	public void setSecurityQuestion2(short SecurityQuestion2) {
		this.SecurityQuestion2 = SecurityQuestion2;
	}

	public short getSecurityQuestion3() {
		return SecurityQuestion3;
	}

	public void setSecurityQuestion3(short SecurityQuestion3) {
		this.SecurityQuestion3 = SecurityQuestion3;
	}
	
	public String getSecurityAnswer1() {
		return SecurityAnswer1;
	}

	public void setSecurityAnswer1(String SecurityAnswer1) {
		this.SecurityAnswer1 = SecurityAnswer1;
	}

	public String SecurityAnswer2() {
		return SecurityAnswer2;
	}

	public void setSecurityAnswer2(String SecurityAnswer2) {
		this.SecurityAnswer2 = SecurityAnswer2;
	}

	public String getSecurityAnswer3() {
		return SecurityAnswer3;
	}

	public void setSecurityAnswer3(String SecurityAnswer3) {
		this.SecurityAnswer3 = SecurityAnswer3;
	}

	public String getAddress1() {
		return Address1;
	}

	public void setAddress1(String Address1) {
		this.Address1 = Address1;
	}

	public short getZip() {
		return Zip;
	}

	public void setZip(short Zip) {
		this.Zip = Zip;
	}

	public String getState() {
		return State;
	}

	public void setState(String State) {
		this.State = State;
	}
	public String getCity() {
		return City;
	}

	public void setCity(String City) {
		this.City = City;
	}
}
