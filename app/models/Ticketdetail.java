package models;

import com.avaje.ebean.Model;
import javax.persistence.*;

@Entity
public class Ticketdetail extends Model {
	private Long detail_id;
	private Long ticket_id;
	private Long meeting_id;
	private Long race_id;
	private Long horse_id;
	public Long getDetail_id() {
		return detail_id;
	}
	public void setDetail_id(Long detail_id) {
		this.detail_id = detail_id;
	}
	public Long getTicket_id() {
		return ticket_id;
	}
	public void setTicket_id(Long ticket_id) {
		this.ticket_id = ticket_id;
	}
	public Long getMeeting_id() {
		return meeting_id;
	}
	public void setMeeting_id(Long meeting_id) {
		this.meeting_id = meeting_id;
	}
	public Long getRace_id() {
		return race_id;
	}
	public void setRace_id(Long race_id) {
		this.race_id = race_id;
	}
	public Long getHorse_id() {
		return horse_id;
	}
	public void setHorse_id(Long horse_id) {
		this.horse_id = horse_id;
	}
	
	public static Finder<String, Ticketdetail> find = new Finder<String, Ticketdetail>(Ticketdetail.class);

}
