package org.halkidiki.petsapp.post;

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

import org.halkidiki.petsapp.notifications.Notification;
import org.halkidiki.petsapp.notifications.NotificationManager;
import org.halkidiki.petsapp.notifications.PetNotification;

public class PostManager {

	private static PostManager activePostManager=null;
	private List<Post> activePosts;
	private List<Post> inactivePosts;

	private PostManager() {
		activePosts = new ArrayList<Post>();
		inactivePosts = new ArrayList<Post>();
	}

	public static PostManager getActivePostManager(){
		if (activePostManager == null) {
			activePostManager = new PostManager();
		}
		return activePostManager;
	}

	public void addPost(Post post) {
		activePosts.add(post);
		NotificationManager nm = NotificationManager.getActiveNotificationManager();
		List<Notification> postsToNotify = nm.getNotificationsForAPost(post);
		
		for(Notification notification : postsToNotify) {
			nm.sendNotification((PetNotification)notification, post);
		}
	}

	public void deletePost(Post post) {
		activePosts.remove(post);
		inactivePosts.remove(post);
	}

	public void postNotLongerRequired(Post post) {
		activePosts.remove(post);
		inactivePosts.add(post);
	}

	public List<LostPets> getPostsOfLostPets() {
		List<LostPets> lostPetsList = new ArrayList<LostPets>();

		for(Post post : activePosts) {
			if(isALostPetPost(post)) {
				lostPetsList.add((LostPets)post);
			}
		}

		return lostPetsList;
	}

	private boolean isALostPetPost(Post post) {
		return post instanceof LostPets;
	}

	/*GETTERS*/
	public List<Post> getPosts() {
		return activePosts;
	}

	public List<Post> getInactivePosts(){
		return inactivePosts;
	}


}
