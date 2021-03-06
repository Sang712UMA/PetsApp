package org.halkidiki.petsapp;

import java.util.List;

import org.halkidiki.petsapp.accounts.User;

public class Pet{

	private int petType, age, petID, size;
	private boolean neutralization;
	private String chip, name, details,sex;
	User adopter = null;
	
	

	public Pet(){}

	public Pet(int petType, int petID, String sex, boolean neutralization, String chip, int age, String name, String details){
		this.petType = petType;
		this.petID = petID;
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

	public void adopt(User adopter) {
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
	
	public User getAdopter(int adopterID,  List<User> l) {
		User current = null;
    	for(User b : l) {
    		if(b.getId() == adopterID) {
    			current = b;
    		}
    	}
    	return current;
	}
	
	public int getSize() {
		return size;
	}
	
	public String toString() { //Adrian
		return details;
	}
	
	public int getUserId() {
		return adopter.getId();
	}
	
}
