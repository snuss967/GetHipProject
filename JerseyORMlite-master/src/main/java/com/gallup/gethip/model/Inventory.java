package com.gallup.gethip.model;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

@XmlRootElement
@DatabaseTable(tableName="inventory")
public class Inventory {
	
	@DatabaseField(columnName = "ID", generatedId = true, unique = true)
	private int ID;
	
	@DatabaseField(columnName = "ItemName", width = 50)
	private String ItemName;
	
	@DatabaseField(columnName = "InsertTime")
	private Date InsertTime;
	
	@DatabaseField(columnName = "SKU")
	private String SKU;
	
	@DatabaseField(columnName = "LastUpdateTime")
	private Date LastUpdateTime;
	
	@DatabaseField(columnName = "SourceStore")
	private int SourceStore;
	
	@DatabaseField(columnName = "DestinationPantry")
	private int DestinationPantry;
	
	@DatabaseField(columnName = "StillInStock")
	private short StillInStock;
	
	public Inventory(){
		
	}

	public int getID() {
		return ID;
	}

	public void setID (int ID) {
		this.ID = ID;
	}
	
	public String getSKU() {
		return SKU;
	}

	public void setSKU (String SKU) {
		this.SKU = SKU;
	}

	public String getItemName() {
		return ItemName;
	}

	public void setItemName(String ItemName) {
		this.ItemName = ItemName;
	}

	public Date getInsertTime() {
		return InsertTime;
	}

	public void setInsertTime(Date InsertTime) {
		this.InsertTime = InsertTime;
	}

	public Date getLastUpdateTime() {
		return LastUpdateTime;
	}

	public void setLastName(Date LastUpdateTime) {
		this.LastUpdateTime = LastUpdateTime;
	}

	public int getSourceStore() {
		return SourceStore;
	}

	public void setSourceStore(int SourceStore) {
		this.SourceStore = SourceStore;
	}

	public boolean getStillInStock() {
		if(StillInStock == 0)
		{
			return true;
		}
		else
			return false;
	}

	public void setStillInStock(boolean StillInStock) {
		if(StillInStock == true)
			this.StillInStock = 0;
		else
			this.StillInStock = 1;
	}
	
	public int getDestinationPantry() {
		return DestinationPantry;
	}

	public void setDestinationPantry(int DestinationPantry) {
		this.DestinationPantry = DestinationPantry;
	}

}
