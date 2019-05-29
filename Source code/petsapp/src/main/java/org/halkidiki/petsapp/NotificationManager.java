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

	public void checkIfPostMustAlertUser (Post post) {
		for (INotification notification : activeNotifications) {
			if(isAPetNotification(notification)) {
				if(((PetNotification) notification).doPostMustBeNotified(post.getPet())) {
					sendNotification(notification);
					deleteNotification (notification);
				}
			}
		}
	}

	private boolean isAPetNotification(INotification notification) {
		return notification.getClass() == PetNotification.class;
	}

	private void deleteNotification (INotification notification) {
		activeNotifications.remove(notification);
	}

	private void sendNotification (INotification notification) {
		//TODO Send between clients TCP
		if (notification.getClass() == PetNotification.class) {
			System.out.println("ALERT user: " + notification.getUser() + "; Pet: " 
					+ ((PetNotification) notification).PetType + " found in a post");

		} else {
			System.out.println("ALERT user: " + notification.getUser() + "; You have a notification");
		}
	}
}
