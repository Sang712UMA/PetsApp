package org.halkidiki.petsapp.notifications;

import org.halkidiki.petsapp.Pet;
import org.halkidiki.petsapp.accounts.User;

public class TaskNotification extends Notification {

    public TaskNotification(User userToBeNotified) {
        super(userToBeNotified);
    }
    
	public boolean doPostMustBeNotified(Pet pet) {
		// TODO Auto-generated method stub
		return false;
	}

}
