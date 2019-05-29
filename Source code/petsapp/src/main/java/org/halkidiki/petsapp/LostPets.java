package org.halkidiki.petsapp;

import java.util.Date;

public class LostPets extends Post{ //Konstantina 
private Date lostDate;
private String lostLocation; 

public LostPets(String lostLocation,Date lostDate){ //Konstantina 
	this.lostDate = lostDate;
	this.lostLocation = lostLocation;
}

public Date getLostDate() { //Konstantina 
	return lostDate;
}

public void setLostDate(Date lostDate) { //Konstantina 
	this.lostDate = lostDate;
}

public String getLostLocation() { //Konstantina 
	return lostLocation;
}

public void setLostLocation(String lostLocation) { //Konstantina 
	this.lostLocation = lostLocation;
}



}
