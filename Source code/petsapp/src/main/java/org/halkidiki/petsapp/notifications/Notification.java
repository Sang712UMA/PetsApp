package org.halkidiki.petsapp.notifications;

import org.halkidiki.petsapp.accounts.User;


public abstract class Notification {
	User userToBeNotified;

	public Notification(User userToBeNotified){
	}

	public User getUser(){
		return null;
	}
}
