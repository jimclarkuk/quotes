package controllers;

import java.util.List;

import models.Quote;
import play.mvc.Controller;

public class RandomQuote extends Controller {

	public static void showRandom(){
		double rnd = Math.random();
    	List<Quote> quotes = Quote.findAll();
    	Quote quote = quotes.get((int)Math.abs(quotes.size()*rnd));
    	render(quote);
	}
}
