
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
public class PantryAccountModify {

    // TODO: update the class to suit your needs
    
    // The Java method will process HTTP GET requests
    @GET 
    // The Java method will produce content identified by the MIME Media
    // type "application/json"
    @Produces("application/json")
    public FoodPantries getAccountStats(@QueryParam("ID") String ID) {
    	FoodPantries pant = null;
    	try {
			pant = getDao().queryForId(ID);
			if(pant == null){
				pant = getDao().queryForId("1");
				return pant;
				//have JavaScript decide based off of given values 
				//if it is the null if it is null return an error message
			}else{
				return pant;
			}
		} catch (SQLException e) {
			e.printStackTrace();
			// throw error message
		}
    	return pant;
        
    }
    
    private Dao<FoodPantries, String> getDao(){
    	Dao<FoodPantries, String> dao = DataSourceManager.getInstance().getDao(FoodPantries.class);
    	return dao;
    }
}