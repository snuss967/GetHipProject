
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
import com.gallup.gethip.model.FoodPantries;
import com.gallup.additionalItems.Success;
import com.j256.ormlite.dao.Dao;

// The Java class will be hosted at the URI path "/pantry/account/register"
//will submit create user data to the database after the JavaScript code has allowed it to continue
@Path("/pantry/account/register/submit")
public class PantryAccountRegisterResource {
    @POST
    @Produces("application/json")
    @Consumes("application/json")
    public Success createPantry(FoodPantries pant){
    	try {
			FoodPantries pantry = getDao().createIfNotExists(pant);
			if(pantry == null){
				Success success = new Success(false, "There Was an Error");
				return success;
			}else{
				Success success = new Success(true, "Action Complete");
				return success;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	Success success = new Success(false, "There Was An Error");
    	return  success;
    }
    
    private Dao<FoodPantries, String> getDao(){
    	Dao<FoodPantries, String> dao = DataSourceManager.getInstance().getDao(FoodPantries.class);
    	return dao;
    }
}