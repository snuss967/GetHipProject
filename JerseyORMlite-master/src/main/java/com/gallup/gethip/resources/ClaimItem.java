package com.gallup.gethip.resources;

import java.sql.SQLException;

import javax.ws.rs.Consumes;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

import com.gallup.gethip.DataSourceManager;
import com.gallup.gethip.model.Employee;
import com.gallup.gethip.model.Inventory;
import com.j256.ormlite.dao.Dao;

@Path("/store/claim")
public class ClaimItem {

    @PUT
    @Produces("text/plain")
    @Consumes("application/json")
    public String Claim(@QueryParam("SKU") String SKUCode, @QueryParam("InventoryID") String IDNumber){
    	try {
    		//we might have to instead pass in the id number and try to getDAO
			Inventory inventoryItem = getDao().queryForId(IDNumber);
			if(inventoryItem.getSKU() == SKUCode){
				return "SKU Codes Match Item Claimed";
				inventoryItem.setStillInStock(false);
			}else{
				return "SKU Codes DoNot Match Item Not Claimed";
			}
			getDao().update(inventoryItem);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return "Error";
		}
    }
    
    private Dao<Inventory, String> getDao(){
    	Dao<Inventory, String> dao = DataSourceManager.getInstance().getDao(Employee.class);
    	return dao;
    }
}