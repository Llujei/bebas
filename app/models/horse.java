package models;

import com.avaje.ebean.Model;
import javax.persistence.*;

@Entity
public class horse extends Model {

	@Id
	private Long horse_id;
	private String rider_name;
	private String trainer_name;
	
	public Long getHorse_id() {
		return horse_id;
	}
	public void setHorse_id(Long horse_id) {
		this.horse_id = horse_id;
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
	
	public static Finder<String, horse> find = new Finder<String, horse>(horse.class);
}
