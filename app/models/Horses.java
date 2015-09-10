package models;

import com.avaje.ebean.Model;
import javax.persistence.*;

@Entity
public class Horses extends Model {
	private String horse_id;
	private String race_id;
	private String meeting_id;
	private String rider_name;
	private String trainer_name;
	private String created_date;
	private String update_date;
	
	public String getHorse_id() {
		return horse_id;
	}
	public void setHorse_id(String horse_id) {
		this.horse_id = horse_id;
	}
	public String getRace_id() {
		return race_id;
	}
	public void setRace_id(String race_id) {
		this.race_id = race_id;
	}
	public String getMeeting_id() {
		return meeting_id;
	}
	public void setMeeting_id(String meeting_id) {
		this.meeting_id = meeting_id;
	}
	public String getRider_name() {
		return rider_name;
	}
	public void setRider_name(String rider_name) {
		this.rider_name = rider_name;
	}
	public String getTrainer_name() {
		return trainer_name;
	}
	public void setTrainer_name(String trainer_name) {
		this.trainer_name = trainer_name;
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
	
	public static Finder<String, Horses> find = new Finder<String,Horses>(Horses.class);
}
