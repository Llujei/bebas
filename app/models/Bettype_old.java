package models;

import com.avaje.ebean.Model;
import javax.persistence.*;

@Entity
public class Bettype_old extends Model {
	private String bet_id;
	private String bet_code;
	private String bet_name;
	private String bet_desc;
	private String created_date;
	private String update_date;
	public String getBet_id() {
		return bet_id;
	}
	public void setBet_id(String bet_id) {
		this.bet_id = bet_id;
	}
	public String getBet_code() {
		return bet_code;
	}
	public void setBet_code(String bet_code) {
		this.bet_code = bet_code;
	}
	public String getBet_name() {
		return bet_name;
	}
	public void setBet_name(String bet_name) {
		this.bet_name = bet_name;
	}
	public String getBet_desc() {
		return bet_desc;
	}
	public void setBet_desc(String bet_desc) {
		this.bet_desc = bet_desc;
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
	
	public static Finder<String,Bettype_old> find = new Finder<String,Bettype_old>(Bettype_old.class);
}
