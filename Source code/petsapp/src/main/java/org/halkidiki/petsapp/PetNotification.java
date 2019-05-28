package org.halkidiki.petsapp;

public class PetNotification implements INotification {

	IUser userToNotify;
	int PetType;
	int sizeMin;
	int sizeMax;
	int ageMin;
	int ageMax;

	public PetNotification (IUser userToNotify, int PetType, int sizeMin, int sizeMax, int ageMin, int ageMax) {
		this.PetType = PetType;
		this.sizeMin = sizeMin;
		this.sizeMax = sizeMax;
		this.ageMin = ageMin;
		this.ageMax = ageMax;
	}


	@Override
	public IUser getUser() {
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
