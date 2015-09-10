package models;

import com.avaje.ebean.Model;
import javax.persistence.*;

@Entity
public class Ticket_detail_before extends Model {
	private String detail_id;
	private String ticket_id;
	private String meeting_id;
	private String race_id;
	private String bet_id;
	private String horse_id;
	private String created_date;
	private String update_date;
	public String getDetail_id() {
		return detail_id;
	}
	public void setDetail_id(String detail_id) {
		this.detail_id = detail_id;
	}
	public String getTicket_id() {
		return ticket_id;
	}
	public void setTicket_id(String ticket_id) {
		this.ticket_id = ticket_id;
	}
	public String getMeeting_id() {
		return meeting_id;
	}
	public void setMeeting_id(String meeting_id) {
		this.meeting_id = meeting_id;
	}
	public String getRace_id() {
		return race_id;
	}
	public void setRace_id(String race_id) {
		this.race_id = race_id;
	}
	public String getBet_id() {
		return bet_id;
	}
	public void setBet_id(String bet_id) {
		this.bet_id = bet_id;
	}
	public String getHorse_id() {
		return horse_id;
	}
	public void setHorse_id(String horse_id) {
		this.horse_id = horse_id;
	}
	public String getCreated_date() {
		return created_date;
	}
	public void setCreated_date(String created_date) {
		this.created_date = created_date;
	}
	public String getUpdate_date() {
		return update_date;
	}
	public void setUpdate_date(String update_date) {
		this.update_date = update_date;
	}
	
	public static Finder<String, Ticket_detail_before> find = new Finder<String, Ticket_detail_before>(Ticket_detail_before.class);

}
