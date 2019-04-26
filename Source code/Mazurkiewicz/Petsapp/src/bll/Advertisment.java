package bll;

import java.util.Date;
import java.util.Dictionary;

import interfaces.IAdvertisment;

public class Advertisment implements IAdvertisment{

	 
	String title;
	String description;
	Dictionary<Integer,String> type;
	Object picture;
	Date startDate;
	Date endDate;
	boolean show;
	Animal animal;
	
	public Advertisment(String title, Dictionary<Integer, String> type, String description, Object picture, Date startDate, Date endDate,
			boolean show, Animal animal) {
		
		
		this.title = title;
		this.type = type;
		this.description = description;
		this.picture = picture;
		this.startDate = startDate;
		this.endDate = endDate; 
		this.animal = animal;
		
	}

	
	public Advertisment() {
		
	}



	public void setAdvertismentType(int key, String advType) {
		this.type.put(key, advType);
		
	}


	public void setTitle(String title) {
		this.title = title;
		
		
	}

	
	public void setDescription(String description) {
		this.description = description;
		
		
	}


	public void setPicture(Object picture) {
		this.picture = picture;
		
		
		
	}

	
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	
		
	}

	
	public void setEndDate(Date endDate) {
		this.endDate = endDate; 
		
	}

	
	public void setVisibility(boolean show) {
		this.show = show;
		
	}

	
	public Dictionary<Integer,String> getAdvertismentType() {
		
		return type;
	}


	public String getTitle() {
		
		return title;
	}


	public String getDescription() {
		// TODO Auto-generated method stub
		return description;
	}


	public Object getPicture() {
		// TODO Auto-generated method stub
		return picture;
	}


	public Date getStartDate() {
		// TODO Auto-generated method stub
		return startDate;
	}


	public Date getEndDate() {
		return endDate;
	}


	public boolean getVisibility() {
		// TODO Auto-generated method stub
		return show;
	}


	public void setAnimal(Animal a) {
		this.animal = a;
		
	}


	public Animal getAnimal() {
		
		return animal;
	}


	@Override
	public void setAdvertismentType(int type) {
		// TODO Auto-generated method stub
		
	}

	
	
	

}
