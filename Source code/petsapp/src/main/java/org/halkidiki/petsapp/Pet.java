package org.halkidiki.petsapp;


public class Pet {

	private int petType, age, petID;
	private boolean sex, neutralization;
	private String chip, name, details;

	public Pet(){}

	public Pet(int petType, boolean sex, boolean neutralization, String chip, int age, String name, String details){
		petType = this.petType;
		sex = this.sex;
		neutralization = this.neutralization;
		chip = this.chip;
		age = this.age;
		name = this.name;
		details = this.details;
	}
	
	public int getPetType() {
		return petType;
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

	public boolean isSex() {
		return sex;
	}

	public void setSex(boolean sex) {
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
		
	}
	
	public void recordAdopter(int adopterID) {
		
	}
	
	
}
