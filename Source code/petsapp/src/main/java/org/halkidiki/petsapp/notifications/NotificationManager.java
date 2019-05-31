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
	}
	
	public static NotificationManager getActiveNotificationManager() {
		return null;
	}

	public void addNotification (Notification notification) {
		
	}

	public void checkIfPostMustAlertUser (Post post) {
	}

	public void deleteNotification (Notification notification) {
	}

	private void sendNotification (Notification notification) {
		
	}
}
