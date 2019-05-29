package org.halkidiki.petsapp.notifications;

import org.halkidiki.petsapp.Pet;
import org.halkidiki.petsapp.User;

/**
 * 
 * @Author: Adrian
 * 
 */

public class PetNotification implements INotification {

	User userToNotify;
	int PetType;
	int sizeMin;
	int sizeMax;
	int ageMin;
	int ageMax;

	public PetNotification (User userToNotify, int PetType, int sizeMin, int sizeMax, int ageMin, int ageMax) {
		this.PetType = PetType;
		this.sizeMin = sizeMin;
		this.sizeMax = sizeMax;
		this.ageMin = ageMin;
		this.ageMax = ageMax;
	}


	@Override
	public User getUser() {
		return userToNotify;
	}

	public boolean doPostMustBeNotified(Pet pet) {
		boolean notify = false;

		if (PetType == pet.getPetType() 
				&& pet.getSize() >= sizeMin && pet.getSize() <= sizeMax 
				&& pet.getAge() >= ageMin && pet.getAge() <= ageMax) {
			notify = true;
		}

		return notify;
	}

}
