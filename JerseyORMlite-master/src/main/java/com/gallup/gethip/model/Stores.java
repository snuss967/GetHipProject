package com.gallup.gethip.model;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

@XmlRootElement
@DatabaseTable(tableName="stores")
public class Stores {
	
	@DatabaseField(columnName = "ID", id = true, generatedId = true, uniqueCombo = true)
	private int ID;
	
	@DatabaseField(columnName = "RegistrationDate")
	private Date RegistrationDate;
	
	@DatabaseField(columnName = "StoreName", width = 50)
	private String StoreName;
	
	@DatabaseField(columnName = "UserName", width = 50, uniqueCombo = true)
	private String UserName;
	
	@DatabaseField(columnName = "Password", width = 50)
	private String Password;
	
	@DatabaseField(columnName = "StoreContactFirstName", width = 50)
	private String StoreContactFirstName;
	
	@DatabaseField(columnName = "StoreContactLastName", width = 50)
	private String StoreContactLastName;
	
	@DatabaseField(columnName = "EmailAddressOfStoreContact", width = 50, uniqueCombo = true)
	private String EmailAddressOfStoreContact;
	
	@DatabaseField(columnName = "StorePhone")
	private int StorePhone;
	
	@DatabaseField(columnName = "ConfirmationCodePhysical")
	private int ConfirmationCodePhysical;
	
	@DatabaseField(columnName = "Active")
	private short Active;
	
	@DatabaseField(columnName = "BannedLength")
	private long BannedLength;
	
	@DatabaseField(columnName = "Banned")
	private short Banned;
	
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
	
	@DatabaseField(columnName = "City", width = 50)
	private String City;
	
	public Stores(){
		
	}

	public int getID() {
		return ID;
	}

	public void setID(int ID) {
		this.ID = ID;
	}
	public String getStoreName() {
		return StoreName;
	}

	public void setStoreName(String StoreName) {
		this.StoreName = StoreName;
	}
	
	public String getStoreContactFirstName() {
		return StoreContactFirstName;
	}

	public void setStoreContactFirstName(String StoreContactFirstName) {
		this.StoreContactFirstName = StoreContactFirstName;
	}
	
	public String getStoreContactLastName() {
		return StoreContactFirstName;
	}

	public void setStoreContactLastName(String StoreContactLastName) {
		this.StoreContactLastName = StoreContactLastName;
	}
	
	public String getUserName() {
		return UserName;
	}

	public void setUserName(String UserName) {
		this.UserName = UserName;
	}
	
	public String getPassword() {
		return Password;
	}

	public void setPassword(String Password) {
		this.Password = Password;
	}
	
	public int getStorePhone()
	{
		return StorePhone;
	}

	public void setStorePhone(int StorePhone) {
		this.StorePhone = StorePhone;
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
	
	public int getConfirmationCodePhysical()
	{
		return ConfirmationCodePhysical;
	}
	
	public void setConfirmationCodePhysical(int ConfirmationCodePhysical)
	{
		this.ConfirmationCodePhysical = ConfirmationCodePhysical;
	}


	public void setBanned(boolean Banned) {
		if(Banned == true)
			this.Banned = 0;
		else
			this.Banned = 1;
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

	public String getSecurityAnswer2() {
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
	public String City() {
		return City;
	}

	public void setCity(String City) {
		this.City = City;
	}
}