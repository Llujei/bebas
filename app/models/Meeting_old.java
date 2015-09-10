package models;

import com.avaje.ebean.Model;
import javax.persistence.*;

@Entity
public class Meeting_old extends Model {
	
	private String meeting_id;
	private String country;
	private String created_date;
	private String update_date;
	
	public String getMeeting_id() {
		return meeting_id;
	}
	public void setMeeting_id(String meeting_id) {
		this.meeting_id = meeting_id;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
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
	
	public static Finder<String,Meeting_old> find = new Finder<String,Meeting_old>(Meeting_old.class);

}
