package org.halkidiki.petsapp.notifications;

import org.halkidiki.petsapp.Pet;
import org.halkidiki.petsapp.User;

/**
 * 
 * @Author: Adrian
 * 
 */

public abstract class Notification {
	User userToBeNotified;
        
        public Notification(User userToBeNotified){
            this.userToBeNotified=userToBeNotified;
        }
        
	User getUser(){
            return userToBeNotified;
        }
}
