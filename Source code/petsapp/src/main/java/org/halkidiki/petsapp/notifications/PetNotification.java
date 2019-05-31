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

	public PetNotification (User userToNotify, int PetType, int sizeMin, int sizeMax, int ageMin, int ageMax) {
            super(userToNotify);
	}

	public boolean doPostMustBeNotified(Pet pet) {
		return false;
	}

}
