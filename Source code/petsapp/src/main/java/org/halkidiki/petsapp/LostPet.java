package org.halkidiki.petsapp;

import java.util.Date;

public class LostPet {

	private Date lostDate;
	private String lostLocation;
	Pet LostPet1 = new Pet();

	public LostPet(){}

	public LostPet(Date lostDate,String lostLocation){
		lostDate = this.lostDate;
		lostLocation = this.lostLocation;
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
	
	public void reportLostPet(int petType, boolean sex, boolean neutralization, String chip, int age, String name, String details) {
		LostPet1.setPetType(petType);
		LostPet1.setSex(sex);
		LostPet1.setNeutralization(neutralization);
		LostPet1.setChip(chip);
		LostPet1.setAge(age);
		LostPet1.setName(name);
		LostPet1.setDetails(details);
	}
}
