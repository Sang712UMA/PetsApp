package org.halkidiki.petsapp.notifications;

/**
 * 
 * @Author: Adrian
 * 
 */

import java.util.ArrayList;

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
		activeNotifications = new ArrayList<Notification>();
	}

	public static NotificationManager getActiveNotificationManager() {
		if (activeNotificationManager == null) {
			activeNotificationManager = new NotificationManager();
		}
		return activeNotificationManager;
	}

	public void addNotification (Notification notification) {
		activeNotifications.add(notification);
	}

	public List<Notification> getNotificationsForAPost (Post post) {
		List<Notification> notificationsToSend = new ArrayList<Notification>();
		
		for(Notification notification : activeNotifications) {
			if (isAPetNotification(notification)) {
				if (((PetNotification)notification).doPostMustBeNotified(post.getPet())) {
					notificationsToSend.add(notification);
				}
			}
		}
		
		return notificationsToSend;
	}

	
	public void deleteNotification (Notification notification) {
		activeNotifications.remove(notification);
	}
	
	public void sendNotification(PetNotification petNotification, Post post) {
		sendNotification(petNotification);
		System.out.println("Maybe this is the pet you are looking for: " + post.getPet());
	}
	
	public void sendMessageNotification(MessageNotification message) {
		sendNotification(message);
		System.out.println(message.message);
	}
        
        public void sendTaskNotification(TaskNotification taskNotification) {
		sendNotification(taskNotification);
		System.out.println(taskNotification.task.getDescription());
	}
	
	private void sendNotification(Notification notification) {
		//TODO (TCP: SERVER -> CLIENT)
		System.out.println("NOTIFY USER " + notification.getUser() + " : ");
		
	}

	private boolean isAPetNotification (Notification notification) {
		return notification instanceof PetNotification;
	}
	/*GETTERS*/
	public List<Notification> getNotifications() {
		return activeNotifications;
	}
}
