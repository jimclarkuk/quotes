package controllers;

import java.util.List;

import models.Quote;

import play.data.validation.Required;
import play.mvc.*;

public class Application extends Controller {
	
    public static void index() {
        render(Quote.findAll());
    }
    
    public static void addQuote(@Required String content){
    	if(Quote.find("from Quote as quote where quote.text like '"+"content"+"'") != null){
    		new Quote(content).save();
    	}
    	index();
    }
    
    

}