package org.halkidiki.petsapp.notifications;

/**
 * 
 * @Author: Adrian
 * 
 */

import org.halkidiki.petsapp.User;


public abstract class Notification {
	User userToBeNotified;

	public Notification(User userToBeNotified){
	}

	public User getUser(){
		return null;
	}
}
