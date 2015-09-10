package models;

import com.avaje.ebean.Model;
import javax.persistence.*;

@Entity
public class Ticket extends Model {
	@Id
	private Long ticket_id;
	private String username;
	private Long ticket_no;
	private Long unit;
	private Long amount;
	
	public Long getTicket_id() {
		return ticket_id;
	}
	public void setTicket_id(Long ticket_id) {
		this.ticket_id = ticket_id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public Long getTicket_no() {
		return ticket_no;
	}
	public void setTicket_no(Long ticket_no) {
		this.ticket_no = ticket_no;
	}
	public Long getUnit() {
		return unit;
	}
	public void setUnit(Long unit) {
		this.unit = unit;
	}
	public Long getAmount() {
		return amount;
	}
	public void setAmount(Long amount) {
		this.amount = amount;
	}
	
	public static Finder<String, Ticket> find = new Finder<String, Ticket>(Ticket.class);
	
}
