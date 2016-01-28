
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
import com.j256.ormlite.dao.Dao;

// The Java class will be hosted at the URI path "/employee"
@Path("/pantry/account/modify")
public class FoodPantriesAccountModifyField {

    // TODO: update the class to suit your needs
    
    // The Java method will process HTTP GET requests
    @PUT 
    // The Java method will produce content identified by the MIME Media
    // type "application/json"
    @Consumes("application/json")
    @Produces("application/json")
    public void modifyField(FoodPantries pantry ) {
    	try {
			if(pantry == null){
				System.out.println("Error Code 405 Not Found please report this to the system admin and restart the website");
			}
			else
			{
				Integer ID = pantry.getID();
				String IDS = ID.toString(); 
				FoodPantries pant = getDao().queryForId(IDS); 
				if(pantry.getActive() != pant.getActive())
				{
					pant.setActive(pantry.getActive());
				}
				if(pantry.getAddress1() != pant.getAddress1())
				{
					pant.setAddress1(pantry.getAddress1());
				}
				if(pantry.getPantryContactPhone() != pant.getPantryContactPhone())
				{
					pant.setPantryContactPhone(pantry.getPantryContactPhone());
				}
				if(pantry.getPassword() != pant.getPassword())
				{
					pant.setPassword(pantry.getPassword());
				}
				if(pantry.getAddress2() != pant.getAddress2())
				{
					pant.setAddress2(pantry.getAddress2());
				}
				if(pantry.getCity() != pant.getCity())
				{
					pant.setCity(pantry.getCity());
				}
				if(pantry.getZip() != pant.getZip())
				{
					pant.setZip(pantry.getZip());
				}
				getDao().update(pant);
				//iterate through the things they can change and then change in the 
				//original data source file then proceed to put the new pant in
			}
		} catch (SQLException e) {
			e.printStackTrace();
			// throw error message
		}
    	
    	
        
    }
    
    private Dao<FoodPantries, String> getDao(){
    	Dao<FoodPantries, String> dao = DataSourceManager.getInstance().getDao(FoodPantries.class);
    	return dao;
    }
}