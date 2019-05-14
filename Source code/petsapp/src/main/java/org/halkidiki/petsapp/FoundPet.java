package org.halkidiki.petsapp;

import java.util.Date;

public class FoundPet {

	private Date foundDate;
	private String foundLocation;

	public FoundPet(){}

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
	};
	
	public void reportFoundPet(int petType, boolean sex, boolean neutralization, boolean tag, String chip, int age, String name, String details) {
		
		
	}
	
	
	
}
