package org.halkidiki.petsapp;

import java.util.Date;

public class FoundPet {

	private Date foundDate;
	private String foundLocation;
	Pet FoundPet1 = new Pet();

	public FoundPet(){}
	
	public FoundPet(Date foundDate,String foundLocation){
		foundDate = this.foundDate;
		foundLocation = this.foundLocation;
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
	
	public void reportFoundPet(int petType, boolean sex, boolean neutralization, String chip, int age, String name, String details) {
		FoundPet1.setPetType(petType);
		FoundPet1.setSex(sex);
		FoundPet1.setNeutralization(neutralization);
		FoundPet1.setChip(chip);
		FoundPet1.setAge(age);
		FoundPet1.setName(name);
		FoundPet1.setDetails(details);
	}
	
	public void getFoundPetData(Pet Pet1) {
		Pet1.getPetType();
		Pet1.isSex();
		Pet1.isNeutralization();
		Pet1.getChip();
		Pet1.getAge();
		Pet1.getName();
		Pet1.getDetails();
	};
	
	
	
}
