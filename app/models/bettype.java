package models;

import com.avaje.ebean.Model;
import javax.persistence.*;

@Entity
public class bettype extends Model {
	
	@Id
	private Long bet_id;
	private String bet_name;
	private String bet_desc;
	
	public Long getBet_id() {
		return bet_id;
	}
	public void setBet_id(Long bet_id) {
		this.bet_id = bet_id;
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
	
	public static Finder<String, bettype> find = new Finder<String, bettype>(bettype.class);

}
