package org.halkidiki.petsapp.post;

import java.util.Date;

import org.halkidiki.petsapp.Pet;

import java.awt.Image;

public class Post { //Konstantina 
	private Image petPicture; 
	private Date postDate;
	private String location, description;
	private int postID, expPoints;
	private Pet pet;
	
	public Pet getPet() { //Konstantina 
		return pet;
	}
	
	public Image getPetPicture() { //Konstantina 
		return petPicture;
	}
	public void setPetPicture(Image petPicture) { //Konstantina 
		this.petPicture = petPicture;
	}
	public Date getPostDate() { //Konstantina 
		return postDate;
	}
	public void setPostDate(Date postDate) { //Konstantina 
		this.postDate = postDate;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) { //Konstantina 
		this.location = location;
	}
	public String getDescription() { //Konstantina 
		return description;
	}
	public void setDescription(String description) { //Konstantina 
		this.description = description;
	}
	public int getExpPoints() { //Konstantina 
		return expPoints;
	}
	public void setExpPoints(int expPoints) { //Konstantina 
		this.expPoints = expPoints;
	}
	public int getPostID() { //Konstantina 
		return postID;
	}
	public void setPostID(int postID) { //Konstantina 
		this.postID = postID;
	}
	
	
	
}
