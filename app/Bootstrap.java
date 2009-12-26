import play.*;
import play.jobs.*;
import play.test.*;
 
import models.*;
 
@OnApplicationStart
public class Bootstrap extends Job {
 
    public void doJob() {
        //Check if the database is empty
        if(Quote.count() == 0) {
        	new Quote("Quote 1").save();
        	new Quote("Quote 2").save();
        	new Quote("Quote 3").save();
        	new Quote("Quote 4").save();
        	new Quote("Quote 5").save();
        	new Quote("Quote 6").save();
        	new Quote("Quote 7").save();
        	new Quote("Quote 8").save();
        	new Quote("Quote 9").save();
        }
    	
    	
    }
 
}