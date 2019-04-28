package interfaces;

import java.util.Date;
import java.util.Dictionary;

import bll.Animal;

public interface IAdvertisment {

	
	
	
	void setAdvertismentType(int type);
	void setTitle(String title);
	void setDescription(String text);
	void setPicture(Object picture);
	void setStartDate(Date startDate);
	void setEndDate(Date endDate);
	void setVisibility(boolean show);
	void setAnimal(Animal a);
	
	String getAdvertismentType();
	String getTitle();
	String getDescription();
	Object getPicture();
	Date getStartDate();
	Date getEndDate();
	Animal getAnimal();
	boolean getVisibility();


	
	
	
	
	
}
