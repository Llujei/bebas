package controllers;

import java.util.*;

import models.*;
import play.*;
import play.libs.Json;
import play.mvc.*;
import play.data.DynamicForm;
import play.data.Form;
import play.db.DB;
import views.html.*;

public class Application extends Controller {

	/*
	 * public Result index() { return
	 * ok(index.render("Your new application is ready.")); }
	 */

	public Result login() {
		// List<Userlogin> loginlist = Userlogin.find.all();

		/*
		 * List<Tuser> betList = Tuser.find.where().ieq("username",
		 * "tan").findList();
		 */

		Form<Tuser> userForm = Form.form(Tuser.class);
		Tuser formdata = userForm.bindFromRequest().get();

		Tuser formdb = Tuser.find.where()
				.ieq("username", formdata.getUsername()).findUnique();

		if (formdb == null) {
			return forbidden();
		} else {
			if (formdb.getPassword().equals(formdata.getPassword())) {

				if (formdb.getInitialflag() == 0) {

					session("username", formdb.getUsername());
					// return ok(Json.toJson(formdb));
					formdb.setInitialflag(1);
					formdb.update();

					return ok("no");

				} else {
					session("username", formdb.getUsername());
					// return ok(Json.toJson(formdb));
					return ok("yes");
				}

			} else {
				return forbidden();
			}
		}
		// return ok(Json.toJson(betList));
	}

	public Result getBettype() {
		response().setHeader("Access-Control-Allow-Credentials", "true");
		response().setHeader("Access-Control-Allow-Origin","http://localhost:8100");
		response().setHeader("Access-Control-Allow-Methods","POST, GET, OPTIONS, DELETE");
		response().setHeader("Access-Control-Max-Age","3600");
		response().setHeader("Access-Control-Allow-Headers","x-requested-with");
		
		List<bettype> bettypeList = bettype.find.all();

		return ok(Json.toJson(bettypeList));
	}

	public Result getMeeting() {
		response().setHeader("Access-Control-Allow-Credentials", "true");
		response().setHeader("Access-Control-Allow-Origin","http://localhost:8100");
		response().setHeader("Access-Control-Allow-Methods","POST, GET, OPTIONS, DELETE");
		response().setHeader("Access-Control-Max-Age","3600");
		response().setHeader("Access-Control-Allow-Headers","x-requested-with");
		
		List<Meeting> meetingList = Meeting.find.all();

		return ok(Json.toJson(meetingList));
	}
	
	public Result getHorse() {
		response().setHeader("Access-Control-Allow-Credentials", "true");
		response().setHeader("Access-Control-Allow-Origin","http://localhost:8100");
		response().setHeader("Access-Control-Allow-Methods","POST, GET, OPTIONS, DELETE");
		response().setHeader("Access-Control-Max-Age","3600");
		response().setHeader("Access-Control-Allow-Headers","x-requested-with");
		
		List<horse> horseList = horse.find.all();

		return ok(Json.toJson(horseList));
	}
	
	public Result getUnit() {
		response().setHeader("Access-Control-Allow-Credentials", "true");
		response().setHeader("Access-Control-Allow-Origin","http://localhost:8100");
		response().setHeader("Access-Control-Allow-Methods","POST, GET, OPTIONS, DELETE");
		response().setHeader("Access-Control-Max-Age","3600");
		response().setHeader("Access-Control-Allow-Headers","x-requested-with");
		
		List<unit> unitList = unit.find.all();

		return ok(Json.toJson(unitList));
	}
	
	public Result getNews() {
		response().setHeader("Access-Control-Allow-Credentials", "true");
		response().setHeader("Access-Control-Allow-Origin","http://localhost:8100");
		response().setHeader("Access-Control-Allow-Methods","POST, GET, OPTIONS, DELETE");
		response().setHeader("Access-Control-Max-Age","3600");
		response().setHeader("Access-Control-Allow-Headers","x-requested-with");
		
		List<news> newsList = news.find.where().orderBy("news_date desc").findList();
		
		List<news> filtered = new ArrayList<news>();
		
		for(int i = 0; i < 7 ; i++){
			filtered.add(newsList.get(i));
		}

		return ok(Json.toJson(filtered));
	}
	
	public Result getNewsbyid(String id) {
		response().setHeader("Access-Control-Allow-Credentials", "true");
		response().setHeader("Access-Control-Allow-Origin","http://localhost:8100");
		response().setHeader("Access-Control-Allow-Methods","POST, GET, OPTIONS, DELETE");
		response().setHeader("Access-Control-Max-Age","3600");
		response().setHeader("Access-Control-Allow-Headers","x-requested-with");
		
		//DynamicForm requestData = Form.form().bindFromRequest();
		//Long news_id = Long.parseLong(requestData.get("news_id"));
		
		news retrievenews = news.find.where().eq("news_id",id).findUnique(); 
		
		return ok(Json.toJson(retrievenews));
	}

	public Result getTicket() {
		response().setHeader("Access-Control-Allow-Credentials", "true");
		response().setHeader("Access-Control-Allow-Origin","http://localhost:8100");
		response().setHeader("Access-Control-Allow-Methods","POST, GET, OPTIONS, DELETE");
		response().setHeader("Access-Control-Max-Age","3600");
		response().setHeader("Access-Control-Allow-Headers","x-requested-with");
		
		List<Ticket> ticketList = Ticket.find.all();

		return ok(Json.toJson(ticketList));
	}

	public Result getTicketdetail() {
		response().setHeader("Access-Control-Allow-Credentials", "true");
		response().setHeader("Access-Control-Allow-Origin","http://localhost:8100");
		response().setHeader("Access-Control-Allow-Methods","POST, GET, OPTIONS, DELETE");
		response().setHeader("Access-Control-Max-Age","3600");
		response().setHeader("Access-Control-Allow-Headers","x-requested-with");
		
		List<Ticketdetail> tdetailList = Ticketdetail.find.all();

		return ok(Json.toJson(tdetailList));
	}

	public Result placebet() {
		// Form<Ticket> ticketform = Form.form(Ticket.class);
		// Ticket provideticket = ticketform.bindFromRequest().get();

		// Form<Ticketdetail> ticketdetailform = Form.form(Ticketdetail.class);
		// Ticketdetail providetdetail =
		// ticketdetailform.bindFromRequest().get();

		// providetdetail.save();
		// provideticket.save();

		DynamicForm requestData = Form.form().bindFromRequest();
		String username = requestData.get("username");
		Long ticket_no = Long.parseLong(requestData.get("ticket_no"));
		Long unit = Long.parseLong(requestData.get("unit"));
		Long amount = Long.parseLong(requestData.get("amount"));
		Long meeting_id = Long.parseLong(requestData.get("meeting_id"));
		Long race_id = Long.parseLong(requestData.get("race_id"));
		Long horse_id = Long.parseLong(requestData.get("horse_id"));

		Ticket retrieveticket;
		retrieveticket = new Ticket();
		Ticketdetail providetdetail;
		providetdetail = new Ticketdetail();

		retrieveticket = Ticket.find.where().eq("username", username)
				.eq("ticket_no", ticket_no).findUnique();

		if (retrieveticket == null) {
			retrieveticket = new Ticket();
			retrieveticket.setUsername(username);
			retrieveticket.setTicket_no(ticket_no);
			retrieveticket.setUnit(unit);
			retrieveticket.setAmount(amount);
			retrieveticket.save();

		}

		// Ticket retrieveticket = Ticket.find.where()
		// .eq("username", provideticket.getUsername())
		// .eq("ticket_no", provideticket.getTicket_no()).findUnique();

		// if (retrieveticket == null) {
		// forbidden();
		// } else {

		// if ()

		providetdetail.setTicket_id(retrieveticket.getTicket_id());
		providetdetail.setMeeting_id(meeting_id);
		providetdetail.setRace_id(race_id);
		providetdetail.setHorse_id(horse_id);
		providetdetail.save();
		// }

		// return ok(Json.toJson(provideticket));
		return ok(Json.toJson(retrieveticket));
		// return ok("ok");
		// return ok(Long.toString(ticket_no));
	}

}
