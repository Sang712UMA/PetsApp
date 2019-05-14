package org.halkidiki.petsapp;


public class Pet {

	private int PetType, age, petID;
	private boolean sex, neutralization;
	private String chip, name, details;

	public Pet(){}

	public int getPetType() {
		return PetType;
	}

	public void setPetType(int petType) {
		PetType = petType;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@SuppressWarnings("unused")
	private int getPetID() {
		return petID;
	}

	@SuppressWarnings("unused")
	private void setPetID(int petID) {
		this.petID = petID;
	}

	public boolean isSex() {
		return sex;
	}

	public void setSex(boolean sex) {
		this.sex = sex;
	}

	@SuppressWarnings("unused")
	private boolean isNeutralization() {
		return neutralization;
	}

	@SuppressWarnings("unused")
	private void setNeutralization(boolean neutralization) {
		this.neutralization = neutralization;
	}

	@SuppressWarnings("unused")
	private String getChip() {
		return chip;
	}

	@SuppressWarnings("unused")
	private void setChip(String chip) {
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
	
	@SuppressWarnings("unused")
	private void getAdopter(int adopterID) {
		
	}
	
	@SuppressWarnings("unused")
	private void recordAdopter(int adopterID) {
		
	}
	
	
}
