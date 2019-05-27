package org.halkidiki.petsapp;

import java.util.List;

public class PostManager {

	private static PostManager activePostManager=null;
	private List<IPost> activePosts;
	private List<IPost> inactivePosts;

	private PostManager() {
		activePostManager = this;
	}

	public static PostManager getActivePostManager(){
		if(activePostManager==null){
			activePostManager= new PostManager();
		}
		return activePostManager;
	}
	
	public List<IPost> getPosts() {
		return activePosts;
	}

	public void addPost(IPost post) {
		activePosts.add(post);
		
		NotificationManager nm = NotificationManager.getActiveNotificationManager();
		nm.checkIfPostMustAlertUser(post.FoundPet1);
	}

	public void deletePost(IPost post) {
		if (activePosts.contains(post)) {
			activePosts.remove(post);
		} else if (inactivePosts.contains(post)){
			inactivePosts.remove(post);
		}
	}
	
	public void postNotLongerRequired(IPost post) {
		activePosts.remove(post);
		inactivePosts.add(post);
	}
	
	

}
