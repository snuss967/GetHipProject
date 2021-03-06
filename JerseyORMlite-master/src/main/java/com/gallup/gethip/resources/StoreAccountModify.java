
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
import com.gallup.gethip.model.Stores;
import com.j256.ormlite.dao.Dao;

// The Java class will be hosted at the URI path "/employee"
@Path("/pantry/account/modify")
public class StoreAccountModify {

    // TODO: update the class to suit your needs
    
    // The Java method will process HTTP GET requests
    @GET 
    // The Java method will produce content identified by the MIME Media
    // type "application/json"
    @Produces("application/json")
    public Stores getAccountStats(@QueryParam("ID") String ID) {
    	Stores store = null;
    	try {
			store = getDao().queryForId(ID);
			if(store == null){
				store = getDao().queryForId("1");
				return store;
				//have JavaScript decide based off of given values 
				//if it is the null if it is null return an error message
			}else{
				return store;
			}
		} catch (SQLException e) {
			e.printStackTrace();
			// throw error message
		}
    	return store;
        
    }
    
    private Dao<Stores, String> getDao(){
    	Dao<Stores, String> dao = DataSourceManager.getInstance().getDao(Stores.class);
    	return dao;
    }
}