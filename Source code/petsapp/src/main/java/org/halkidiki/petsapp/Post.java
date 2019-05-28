package org.halkidiki.petsapp;

import java.util.Date;
import java.awt.Image;

public class Post {
	private Image petPicture; 
	private Date postDate;
	private String location, description;
	private int postID, expPoints;
	
	public Image getPetPicture() {
		return petPicture;
	}
	public void setPetPicture(Image petPicture) {
		this.petPicture = petPicture;
	}
	public Date getPostDate() {
		return postDate;
	}
	public void setPostDate(Date postDate) {
		this.postDate = postDate;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getExpPoints() {
		return expPoints;
	}
	public void setExpPoints(int expPoints) {
		this.expPoints = expPoints;
	}
	public int getPostID() {
		return postID;
	}
	public void setPostID(int postID) {
		this.postID = postID;
	}
	
	
	
}
