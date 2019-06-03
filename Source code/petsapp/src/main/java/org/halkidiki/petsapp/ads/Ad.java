package org.halkidiki.petsapp.ads;

import java.util.List;

/**
 *
 * @author George
 */
public class Ad {

	private String banner;
	private String body;
	private String link;
	private List<Tag> tags;
	
	public Ad() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Ad(String banner, String body, String link, List<Tag> tags) {
		super();
		this.banner = banner;
		this.body = body;
		this.link = link;
		this.tags = tags;
	}
	public String getBanner() {
		return banner;
	}
	public void setBanner(String banner) {
		this.banner = banner;
	}
	public String getBody() {
		return body;
	}
	public void setBody(String body) {
		this.body = body;
	}
	public String getLink() {
		return link;
	}
	public void setLink(String link) {
		this.link = link;
	}
	public List<Tag> getTags() {
		return tags;
	}
	public void setTags(List<Tag> tags) {
		this.tags = tags;
	}
}
