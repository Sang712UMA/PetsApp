package org.halkidiki.petsapp.notifications;

import org.halkidiki.petsapp.Pet;
import org.halkidiki.petsapp.User;

/**
 * 
 * @Author: Adrian
 * 
 */

public interface INotification {
	
	User getUser();
	boolean doPostMustBeNotified(Pet pet);
}
