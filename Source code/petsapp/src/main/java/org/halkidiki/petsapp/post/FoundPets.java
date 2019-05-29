package org.halkidiki.petsapp.post;

import java.util.Date;


public class FoundPets extends Post{ //Konstantina 

private Date foundDate;
private String foundLocation;


public FoundPets(){}

public FoundPets(Date foundDate,String foundLocation){ //Konstantina 
	this.foundDate = foundDate;
	this.foundLocation = foundLocation;
}


public Date getFoundDate() { //Konstantina 
	return foundDate;
}

public void setFoundDate(Date foundDate) { //Konstantina 
	this.foundDate = foundDate;
}

public String getFoundLocation() { //Konstantina 
	return foundLocation;
}

public void setFoundLocation(String foundLocation) { //Konstantina 
	this.foundLocation = foundLocation; 
}




}
