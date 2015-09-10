package models;

import com.avaje.ebean.Model;
import javax.persistence.*;

@Entity
public class Meeting extends Model {
	
	@Id
	private Long meeting_id;
	private String meeting_name;
	private String meeting_date;
	
	public Long getMeeting_id() {
		return meeting_id;
	}
	public void setMeeting_id(Long meeting_id) {
		this.meeting_id = meeting_id;
	}
	public String getMeeting_name() {
		return meeting_name;
	}
	public void setMeeting_name(String meeting_name) {
		this.meeting_name = meeting_name;
	}
	public String getMeeting_date() {
		return meeting_date;
	}
	public void setMeeting_date(String meeting_date) {
		this.meeting_date = meeting_date;
	}
	
	public static Finder<String, Meeting> find = new Finder<String, Meeting>(Meeting.class);

}
