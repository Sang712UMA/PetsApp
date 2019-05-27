package org.halkidiki.petsapp;

import java.util.List;

public class NotificationManager {

	private static NotificationManager activeNotificationManager=null;
	private List<INotification> activeNotifications;

	private NotificationManager() {
		activeNotificationManager = this;
	}

	public static NotificationManager getActiveNotificationManager() {
		if(activeNotificationManager==null){
			activeNotificationManager= new NotificationManager();
		}
		return activeNotificationManager;
	}

	public void addNotification (INotification notification) {
		activeNotifications.add(notification);
	}

	public void checkIfPostMustAlertUser (Pet pet) {
		for (INotification notification : activeNotifications) {
			if(notification.doPostMustBeNotified(pet)) {
				sendNotification(notification, pet);
				deleteNotification (notification);
			}
		}
	}

	private void deleteNotification (INotification notification) {
		activeNotifications.remove(notification);
	}

	private void sendNotification (INotification notification, Pet pet) {
		//TODO Send between clients TCP
		System.out.println("User: " + notification.getUser().getId() + " CHECK POST: " + pet.getPetID());
	}
}
