package org.halkidiki.petsapp.notifications;

/**
 * 
 * @Author: Adrian
 * 
 */

import org.halkidiki.petsapp.Pet;
import org.halkidiki.petsapp.accounts.User;

public class PetNotification extends Notification {

	int PetType;
	int sizeMin;
	int sizeMax;
	int ageMin;
	int ageMax;

	public PetNotification (User userToNotify, int PetType, int sizeMin, 
			int sizeMax, int ageMin, int ageMax) {

		super(userToNotify);
		this.PetType = PetType;
		this.sizeMin = sizeMin;
		this.sizeMax = sizeMax;
		this.ageMin = ageMin;
		this.ageMax = ageMax;
	}

	public boolean doPostMustBeNotified(Pet pet) {
		boolean notify;

		if(pet.getPetType() == PetType &&
				pet.getAge() >= ageMin && 
				pet.getAge() <= ageMax &&
				pet.getSize() >= sizeMin && 
				pet.getSize() <= sizeMax) {

			notify = true;
		} else {
			notify = false;
		}

		return notify;
	}

}
