package models;

import com.avaje.ebean.Model;
import javax.persistence.*;

@Entity
public class Unit_old extends Model {
	private Long unit;

	public Long getUnit() {
		return unit;
	}

	public void setUnit(Long unit) {
		this.unit = unit;
	}
	
	public static Finder<String,Unit_old> find = new Finder<String,Unit_old>(Unit_old.class);

}
