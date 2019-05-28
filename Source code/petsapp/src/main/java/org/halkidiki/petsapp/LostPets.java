package org.halkidiki.petsapp;

import java.util.Date;

public class LostPets extends Post{
private Date lostDate;
private String lostLocation; 

public LostPets(String lostLocation,Date lostDate){
	this.lostDate = lostDate;
	this.lostLocation = lostLocation;
}

public Date getLostDate() {
	return lostDate;
}

public void setLostDate(Date lostDate) {
	this.lostDate = lostDate;
}

public String getLostLocation() {
	return lostLocation;
}

public void setLostLocation(String lostLocation) {
	this.lostLocation = lostLocation;
}



}
