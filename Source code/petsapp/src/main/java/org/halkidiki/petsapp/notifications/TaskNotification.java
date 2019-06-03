package org.halkidiki.petsapp.notifications;

import org.halkidiki.petsapp.Pet;
import org.halkidiki.petsapp.Task;
import org.halkidiki.petsapp.accounts.User;

public class TaskNotification extends Notification {

    Task task;
    
    public TaskNotification(User userToBeNotified , Task task) {
        super(userToBeNotified);
        this.task = task;
    }
    
	public boolean doPostMustBeNotified(Pet pet) {
		// TODO Auto-generated method stub
		return false;
	}

}
