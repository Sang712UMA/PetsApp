package org.halkidiki.petsapp;

import java.util.Date;


public class FoundPets extends Post{

private Date foundDate;
private String foundLocation;


public FoundPets(){}

public FoundPets(Date foundDate,String foundLocation){
	this.foundDate = foundDate;
	this.foundLocation = foundLocation;
}


public Date getFoundDate() {
	return foundDate;
}

public void setFoundDate(Date foundDate) {
	this.foundDate = foundDate;
}

public String getFoundLocation() {
	return foundLocation;
}

public void setFoundLocation(String foundLocation) {
	this.foundLocation = foundLocation;
}




}
