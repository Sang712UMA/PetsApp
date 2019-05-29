package org.halkidiki.petsapp;

import java.util.List;

public class PostManager {

	private static PostManager activePostManager=null;
	private List<Post> activePosts;
	private List<Post> inactivePosts;

	private PostManager() {
		activePostManager = this;
	}

	public static PostManager getActivePostManager(){
		if(activePostManager==null){
			activePostManager= new PostManager();
		}
		return activePostManager;
	}
	
	public List<Post> getPosts() {
		return activePosts;
	}

	public void addPost(Post post) {
		activePosts.add(post);
		
		NotificationManager nm = NotificationManager.getActiveNotificationManager();
		nm.checkIfPostMustAlertUser(post);
	}

	public void deletePost(Post post) {
		if (activePosts.contains(post)) {
			activePosts.remove(post);
		} else if (inactivePosts.contains(post)){
			inactivePosts.remove(post);
		}
	}
	
	public void postNotLongerRequired(Post post) {
		activePosts.remove(post);
		inactivePosts.add(post);
	}
	
	

}
