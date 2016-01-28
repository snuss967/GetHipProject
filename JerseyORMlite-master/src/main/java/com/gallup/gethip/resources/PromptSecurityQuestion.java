import java.sql.SQLException;
import java.util.Random;
import com.gallup.additionalItems.SecurityQuestionList;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

import com.gallup.gethip.DataSourceManager;
import com.gallup.gethip.model.Employee;
import com.gallup.gethip.model.SecurityQuestions;
import com.gallup.gethip.model.Stores;
import com.j256.ormlite.dao.Dao;
import com.gallup.additionalItems.Security;
public class PromptSecurityQuestion {
// The Java method will produce content identified by the MIME Media
    // type "application/json"
	 int numSecurityQuestions = 3;
	@GET
	@Produces("application/json")
    public Security getSecurityQuestion(@QueryParam("ID") Integer ID) {
    	Random rand = new Random();
    	Integer randInt = (rand.nextInt(3) + 1);
    	//choose a random question we have three of them
    	String randString = randInt.toString();
    	String DatabaseField = "SecurityQuestion" + randString; 
    	Stores store;
    	Security secure = new Security();
    	try {
    		String StoreID = ID.toString();
			store = getDao().queryForId(StoreID);
			secure.setID(ID);
			if(store == null){
				// throw error message
				secure.setProblem(true);
				//we return json that tells the front side that there has been an error
				//they can handle the error
				return secure;
			}else{
				secure.setProblem(false);
				// we move on
			}
		} catch (SQLException e) {
			e.printStackTrace();
			secure.setProblem(true);
			// we establish that there was a problem
			return secure;
			// throw error message
		}
    	String SecurityQuestion;
    	Short SecurityQuestionNum;
    	String QuestionIDString;
    	switch(DatabaseField)
    	{
    		//we find what question out of the three question we have
    		//set the question number so that we can return it in our xml code for later consumption
    		//will want to put this in a cookie
    		case "SecurityQuestion1":
    			 SecurityQuestionNum = store.getSecurityQuestion1();
    			 QuestionIDString = SecurityQuestionNum.toString();
    			 secure.SecurityQuestionNum(QuestionIDString);
    			 break;
    		case "SecurityQuestion2":
    			 SecurityQuestionNum = store.getSecurityQuestion2();
    			 QuestionIDString = SecurityQuestionNum.toString();
    			 secure.SecurityQuestionNum(QuestionIDString);
    			 break;
    		case "SecurityQuestion3":
    			 SecurityQuestionNum = store.getSecurityQuestion3();
    			 QuestionIDString = SecurityQuestionNum.toString();
    			 secure.SecurityQuestionNum(QuestionIDString);
    			 break;
    		default:
    			secure.setProblem(true);
    			return secure;
    			break;
    	}
    	String SecurityQuestionString = "SecurityQuestion" + QuestionIDString;
        SecurityQuestionList secQuestList = new SecurityQuestionList();
    	//our question are in a list
        switch(SecurityQuestionString)
        {
        //we find what question we have and we set that question
        case"SecurityQuestion1":
        	secure.setSecurityQuestion(secQuestList.getSecurityQuestion1());
        	break;
        case"SecurityQuestion2":
        	secure.setSecurityQuestion(secQuestList.getSecurityQuestion2());
        	break;
        case"SecurityQuestion3":
        	secure.setSecurityQuestion(secQuestList.getSecurityQuestion3());
        	break;
        case"SecurityQuestion4":
        	secure.setSecurityQuestion(secQuestList.getSecurityQuestion4());
        	break;
        case"SecurityQuestion5":
        	secure.setSecurityQuestion(secQuestList.getSecurityQuestion5());
        	break;
        case"SecurityQuestion6":
        	secure.setSecurityQuestion(secQuestList.getSecurityQuestion6());
        	break;
        case"SecurityQuestion7":
        	secure.setSecurityQuestion(secQuestList.getSecurityQuestion7());
        	break;
        case"SecurityQuestion8":
        	secure.setSecurityQuestion(secQuestList.getSecurityQuestion8());
        	break;
        case"SecurityQuestion9":
        	secure.setSecurityQuestion(secQuestList.getSecurityQuestion9());
        	break;
        case"SecurityQuestion10":
        	secure.setSecurityQuestion(secQuestList.getSecurityQuestion10());
        	break;
        case"SecurityQuestion11":
        	secure.setSecurityQuestion(secQuestList.getSecurityQuestion11());
        	break;
        case"SecurityQuestion12":
        	secure.setSecurityQuestion(secQuestList.getSecurityQuestion12());
        	break;
        case"SecurityQuestion13":
        	secure.setSecurityQuestion(secQuestList.getSecurityQuestion13());
        	break;
        default:
        	secure.setProblem(true);
        	return secure;
        	break;
        }
        // return json with the question text, the question number, and wheteher it was successful or not
    	return secure;
    }
    private Dao<Stores, String> getDao(){
    	Dao<Stores, String> dao = DataSourceManager.getInstance().getDao(SecurityQuestions.class);
    	return dao;
    }
}