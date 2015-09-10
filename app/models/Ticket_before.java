package models;

import com.avaje.ebean.Model;
import javax.persistence.*;

@Entity
public class Ticket_before extends Model {
	
	private String ticket_id;
	private String ticket_no;
	private Long amount;
	private Boolean process_flag;
	private Boolean win_flag;
	private String created_date;
	private String update_date;
	
	public String getTicket_id() {
		return ticket_id;
	}
	public void setTicket_id(String ticket_id) {
		this.ticket_id = ticket_id;
	}
	public String getTicket_no() {
		return ticket_no;
	}
	public void setTicket_no(String ticket_no) {
		this.ticket_no = ticket_no;
	}
	public Long getAmount() {
		return amount;
	}
	public void setAmount(Long amount) {
		this.amount = amount;
	}
	public Boolean getProcess_flag() {
		return process_flag;
	}
	public void setProcess_flag(Boolean process_flag) {
		this.process_flag = process_flag;
	}
	public Boolean getWin_flag() {
		return win_flag;
	}
	public void setWin_flag(Boolean win_flag) {
		this.win_flag = win_flag;
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
	
	public static Finder<String, Ticket_before> find = new Finder<String, Ticket_before>(Ticket_before.class);
	
}
