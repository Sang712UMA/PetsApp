package org.halkidiki.petsapp.notifications;

import org.halkidiki.petsapp.Pet;
import org.halkidiki.petsapp.User;

public class MessageNotification implements INotification {

	@Override
	public User getUser() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean doPostMustBeNotified(Pet pet) {
		// TODO Auto-generated method stub
		return false;
	}

}
