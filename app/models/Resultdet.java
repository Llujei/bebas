package models;

import com.avaje.ebean.Model;

import javax.persistence.*;

@Entity
public class Resultdet extends Model {
	private String detail_id;
	private String result_id;
	private String horse1_id;
	private String horse2_id;
	private String horse3_id;
	private String horse4_id;
	private String created_date;
	private String update_date;
	public String getDetail_id() {
		return detail_id;
	}
	public void setDetail_id(String detail_id) {
		this.detail_id = detail_id;
	}
	public String getResult_id() {
		return result_id;
	}
	public void setResult_id(String result_id) {
		this.result_id = result_id;
	}
	public String getHorse1_id() {
		return horse1_id;
	}
	public void setHorse1_id(String horse1_id) {
		this.horse1_id = horse1_id;
	}
	public String getHorse2_id() {
		return horse2_id;
	}
	public void setHorse2_id(String horse2_id) {
		this.horse2_id = horse2_id;
	}
	public String getHorse3_id() {
		return horse3_id;
	}
	public void setHorse3_id(String horse3_id) {
		this.horse3_id = horse3_id;
	}
	public String getHorse4_id() {
		return horse4_id;
	}
	public void setHorse4_id(String horse4_id) {
		this.horse4_id = horse4_id;
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
	
	public static Finder<String, Resultdet> find = new Finder<String, Resultdet>(Resultdet.class);
}
