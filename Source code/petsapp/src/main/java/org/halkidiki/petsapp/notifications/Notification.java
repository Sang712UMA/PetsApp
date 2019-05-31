package org.halkidiki.petsapp.notifications;

import org.halkidiki.petsapp.accounts.User;


public abstract class Notification {
	
	private User userToBeNotified;

	public Notification(User userToBeNotified){
		this.userToBeNotified = userToBeNotified;
	}

	public User getUser(){
		return userToBeNotified;
	}
}
