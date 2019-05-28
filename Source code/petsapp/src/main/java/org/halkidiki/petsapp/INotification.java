package org.halkidiki.petsapp;

public interface INotification {
	
	User getUser();
	boolean doPostMustBeNotified(Pet pet);
}
