package models;

import com.avaje.ebean.Model;
import javax.persistence.*;

@Entity
public class news extends Model {
	@Id
	private Long news_id;
	private String image_url;
	private String title;
	private String content;
	private String news_date;
	
	public Long getNews_id() {
		return news_id;
	}
	public void setNews_id(Long news_id) {
		this.news_id = news_id;
	}
	public String getImage_url() {
		return image_url;
	}
	public void setImage_url(String image_url) {
		this.image_url = image_url;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getNews_date() {
		return news_date;
	}
	public void setNews_date(String news_date) {
		this.news_date = news_date;
	}


	public static Finder<String, news> find = new Finder<String, news>(news.class);

}
