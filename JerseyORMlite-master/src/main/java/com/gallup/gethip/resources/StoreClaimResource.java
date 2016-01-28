
package com.gallup.gethip.resources;

import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

import com.gallup.gethip.DataSourceManager;
import com.gallup.gethip.model.Employee;
import com.gallup.gethip.model.FoodPantries;
import com.gallup.gethip.model.Inventory;
import com.gallup.gethip.model.Stores;
import com.j256.ormlite.dao.Dao;

// The Java class will be hosted at the URI path "/employee"
@Path("/store/claim")
public class StoreClaimResource {

    // TODO: update the class to suit your needs
    
    // The Java method will process HTTP GET requests
    @DELETE 
    // The Java method will produce content identified by the MIME Media
    // type "application/json"
    @Produces("application/json")
    public void claimProduct(@QueryParam("ID") String ID, @QueryParam("SKU") String SKU) {
    	Inventory invent = null;
    	try {
			invent = getDao().queryForId(ID);
			if(invent == null){
				System.out.println("Error");
			}
			else{
				if(SKU == invent.getSKU())
				{
				getDao().delete(invent);
				}
				else
					System.out.println("Error");
					
			}
		} catch (SQLException e) {
			e.printStackTrace();
			// throw error message
			System.out.println("Error");
		}
        
    }
    
    private Dao<Inventory, String> getDao(){
    	Dao<Inventory, String> dao = DataSourceManager.getInstance().getDao(Inventory.class);
    	return dao;
    }
}