package org.halkidiki.petsapp.post;

/**
 * 
 * @Author: Adrian
 * 
 */

import java.util.List;

import org.halkidiki.petsapp.notifications.NotificationManager;

public class PostManager {

	private static PostManager activePostManager=null;
	private List<Post> activePosts;
	private List<Post> inactivePosts;

	private PostManager() {
	}

	public static PostManager getActivePostManager(){
		return null;
	}
	
	public List<Post> getPosts() {
		return null;
	}

	public void addPost(Post post) {
	}

	public void deletePost(Post post) {
	
	}
	
	public void postNotLongerRequired(Post post) {
	}
	
	

}
