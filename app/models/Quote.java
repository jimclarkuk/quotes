package models;
 
import java.util.*;

import javax.persistence.*;
 
import play.db.jpa.*;
 
@Entity
public class Quote extends Model {

	@Lob
	public String text;
	
	public Quote(String theQuote) {
		text = theQuote;
	}
	
	public static Quote findQuote(String text){
		return Quote.find("byText", text).first();
	}
}
