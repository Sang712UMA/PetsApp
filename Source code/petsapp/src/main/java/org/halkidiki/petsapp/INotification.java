package org.halkidiki.petsapp;

/**
 * 
 * @Author: Adrian
 * 
 */

public interface INotification {
	
	User getUser();
	boolean doPostMustBeNotified(Pet pet);
}
