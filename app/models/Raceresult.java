package models;

import com.avaje.ebean.Model;

import javax.persistence.*;

@Entity
public class Raceresult extends Model {
	private String result_id;
	private String meeting_id;
	private String race_id;
	private String created_date;
	private String update_date;
	public String getResult_id() {
		return result_id;
	}
	public void setResult_id(String result_id) {
		this.result_id = result_id;
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
	
	public static Finder<String, Raceresult> find = new Finder<String,Raceresult>(Raceresult.class);
	
}
