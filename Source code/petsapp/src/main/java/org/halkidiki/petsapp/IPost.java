package org.halkidiki.petsapp;

import java.util.Date;

public class IPost {
	private Date foundDate;
	private String foundLocation;
	Pet FoundPet1 = new Pet();

	public IPost(){}
	
	public IPost(Date foundDate,String foundLocation){
		this.foundDate = foundDate;
		this.foundLocation = foundLocation;
	}
	public IPost(String lostLocation,Date lostDate){
		this.lostDate = lostDate;
		this.lostLocation = lostLocation;
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
	};
	
	
	
	
	
	private Date lostDate;
	private String lostLocation;
	Pet LostPet1 = new Pet();


	
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
