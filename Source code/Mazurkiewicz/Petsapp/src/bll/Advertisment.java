package bll;

import java.util.Date;
import java.util.Dictionary;
import java.util.HashMap;
import java.util.Map;

import UsersTypes.User;
import interfaces.IAdvertisment;

public class Advertisment implements IAdvertisment {

	int id; 
	String title;
	String description;
	String TypeOfAdvertisment;
	Object picture;
	Date startDate;
	Date endDate;
	boolean show;
	Animal animal;
	User user;
	
	Map<Integer, String> type = new HashMap<Integer, String>() {
		{
			
			put(1, " Hospitality and Founded");
			put(2, "PetSitting");
			put(3, "Lost Pets");
		}
	};

	public Advertisment(String title, int type, String description, Object picture,
			Date startDate, Date endDate, boolean show, Animal animal) {

		this.title = title;
		this.TypeOfAdvertisment = this.type.get(type);
		this.description = description;
		this.picture = picture;
		this.startDate = startDate;
		this.endDate = endDate;
		this.animal = animal;

	}

	public Advertisment() {

	}

	public Advertisment(String title, int type, String description, Object picture, Date startDate, Date endDate,
			boolean show) {

		this.title = title;
		this.TypeOfAdvertisment = this.type.get(type);
		this.description = description;
		this.picture = picture;
		this.startDate = startDate;
		this.endDate = endDate;
		this.animal = animal;
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

	public String getAdvertismentType() {

		return TypeOfAdvertisment;
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

	public String toString() {
		
		
		return title +" "+ description+ " " + TypeOfAdvertisment + " " + startDate + " " + endDate + " ";
	}

}
