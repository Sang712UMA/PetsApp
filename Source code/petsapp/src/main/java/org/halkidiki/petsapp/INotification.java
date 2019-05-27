package org.halkidiki.petsapp;

public interface INotification {
	
	IUser getUser();
	boolean doPostMustBeNotified(Pet pet);
}
