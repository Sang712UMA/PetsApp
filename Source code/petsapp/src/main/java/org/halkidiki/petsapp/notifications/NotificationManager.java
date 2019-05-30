package org.halkidiki.petsapp.notifications;

/**
 * 
 * @Author: Adrian
 * 
 */

import java.util.List;

import org.halkidiki.petsapp.post.Post;

public class NotificationManager {

	private static NotificationManager activeNotificationManager=null;
	private List<Notification> activeNotifications;

	private NotificationManager() {
		activeNotificationManager = this;
	}
	
	public static NotificationManager getActiveNotificationManager() {
		if(activeNotificationManager==null){
			activeNotificationManager= new NotificationManager();
		}
		return activeNotificationManager;
	}

	public void addNotification (Notification notification) {
		activeNotifications.add(notification);
	}

	public void checkIfPostMustAlertUser (Post post) {
		for (Notification notification : activeNotifications) {
			if(isAPetNotification(notification)) {
				if(((PetNotification) notification).doPostMustBeNotified(post.getPet())) {
					sendNotification(notification);
					deleteNotification (notification);
				}
			}
		}
	}

	private boolean isAPetNotification(Notification notification) {
		return notification.getClass() == PetNotification.class;
	}

	private void deleteNotification (Notification notification) {
		activeNotifications.remove(notification);
	}

	private void sendNotification (Notification notification) {
		//TODO Send between clients TCP
		if (notification.getClass() == PetNotification.class) {
			System.out.println("ALERT user: " + notification.getUser() + "; Pet: " 
					+ ((PetNotification) notification).PetType + " found in a post");

		} else {
			System.out.println("ALERT user: " + notification.getUser() + "; You have a notification");
		}
	}
}
