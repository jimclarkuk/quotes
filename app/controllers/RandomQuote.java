package controllers;

import javax.persistence.Query;

import models.Quote;
import play.mvc.Controller;

public class RandomQuote extends Controller {

	public static void showRandom() {
		Query q = Quote.getEntityManager().createQuery(
				"from Quote as quot ORDER BY RAND()");
		q.setMaxResults(1);
		Quote quote = (Quote) q.getSingleResult();
		render(quote);
	}
}
