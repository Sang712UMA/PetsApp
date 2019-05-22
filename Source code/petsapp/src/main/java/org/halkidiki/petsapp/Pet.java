package org.halkidiki.petsapp;


public class Pet {

	private int petType, age, petID;
	private boolean neutralization;
	private String chip, name, details,sex;
	IUser adopter = null;
	
	

	public Pet(){}

	public Pet(int petType, String sex, boolean neutralization, String chip, int age, String name, String details){
		this.petType = petType;
		this.sex = sex;
		this.neutralization = neutralization;
		this.chip = chip;
		this.age = age;
		this.name = name;
		this.details = details;
	}
	
	public int getPetType() {
		return petType;
	}

	public void adopt(IUser adopter) {
		this.adopter = adopter;
	}
	
	public void setPetType(int petType) {
		this.petType = petType;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getPetID() {
		return petID;
	}

	@SuppressWarnings("unused")
	public void setPetID(int petID) {
		this.petID = petID;
	}

	public String isSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public boolean isNeutralization() {
		return neutralization;
	}

	public void setNeutralization(boolean neutralization) {
		this.neutralization = neutralization;
	}

	public String getChip() {
		return chip;
	}

	public void setChip(String chip) {
		this.chip = chip;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDetails() {
		return details;
	}

	public void setDetails(String details) {
		this.details = details;
	}
	
	public void getAdopter(int adopterID) {
		if (adopter.getId() == adopterID) {
			adopter.getNickName();
			adopter.getCity();
			adopter.getCreationDate();
			adopter.getEmail();
			adopter.getPhoneNumber();
			adopter.getProfilePicture();
			adopter.getStreet();
		}
	}
	
	public void recordAdopter(int adopterID) {
		if (adopter.getId() == adopterID) {
			adopter.setNickName(UserInput.getString());
			adopter.setCity(UserInput.getString());
			// adopter.setCreationDate();
			adopter.setEmail(UserInput.getString());
			adopter.setPhoneNumber(UserInput.getInteger());
			//adopter.setProfilePicture();
			adopter.setStreet(UserInput.getString());
		}
	}
	
	
}
