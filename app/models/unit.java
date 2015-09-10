package models;

import com.avaje.ebean.Model;
import javax.persistence.*;

@Entity
public class unit extends Model {
	
	@Id
	private Long unit;

	public Long getUnit() {
		return unit;
	}

	public void setUnit(Long unit) {
		this.unit = unit;
	}
	
	public static Finder<String, unit> find = new Finder<String, unit>(unit.class);
}
