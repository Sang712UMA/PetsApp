package org.halkidiki.petsapp;

import java.util.Date;

public class LostPet {

	private Date lostDate;
	private String lostLocation;

	public LostPet(){}

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
	
	public void reportLostPet(int petType, boolean sex, boolean neutralization, boolean tag, String chip, int age, String name, String details) {
		
	}
}
