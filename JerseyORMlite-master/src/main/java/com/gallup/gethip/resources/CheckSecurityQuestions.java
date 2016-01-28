import java.sql.SQLException;
import java.util.Random;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import com.gallup.additionalItems.Security;
import com.gallup.additionalItems.Success;
import com.gallup.gethip.DataSourceManager;
import com.gallup.gethip.model.Employee;
import com.gallup.gethip.model.SecurityQuestions;
import com.gallup.gethip.model.Stores;
import com.j256.ormlite.dao.Dao;
public class CheckSecurityQuestions {
// The Java method will produce content identified by the MIME Media
    // type "application/json"
    @GET
    @Consumes("application/json")
	@Produces("application/json")
    public Success checkSecurityQuestion(@QueryParam("Answer") String Answer, Security security) {
    	Success suc;
    	Security sec;
    	Stores store;
    	String QuestAnswer;
    	try {
    		sec = new Security();
    		Integer ID = sec.getID();
    		String IDString = ID.toString(); 
    		store = getDao().queryForId(IDString); //create a new store
			QuestAnswer = Answer;
			if(sec == null  || store == null)
			{
				// throw error message
				suc = new Success(false, "The security object was null");
				return suc;
			}
			else
			{
				if(Answer == null)
				{
					Answer = "";
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
			// throw error message
			suc = new Success(false, "There was an error in the creation of an object");
			return suc;
		}
    	String securityAnswer = "SecurityAnswer";
    	securityAnswer = securityAnswer + sec.getSecurityQuestionNum();
    	switch(securityAnswer)
    	{
    		case("SecurityAnswer1"):
    			if(store.getSecurityAnswer1() == QuestAnswer )
    			{
    				suc = new Success(true, "Success");
    				//put in code to send a server reset email
    			}
    			else
    				
    				break;
    		case("SecurityAnswer2"):
    			if(store.getSecurityAnswer2() == QuestAnswer)
    			{
    				suc = new Success(true, "Success");
    				//put in code to send a server reset password email
    			}
    				break;
    		case("SecurityAnswer3"):
    			if(store.getSecurityAnswer3() == QuestAnswer)
    			{
    				suc = new Success(true, "Success");
    				//put in code to send a server password reset email
    			}
    				break;
    		default:
    			suc = new Success(false, "There was an error");
    }
    	return suc;
        
    }
    private Dao<Stores, String> getDao(){
    	Dao<Stores, String> dao = DataSourceManager.getInstance().getDao(SecurityQuestions.class);
    	return dao;
    }
}