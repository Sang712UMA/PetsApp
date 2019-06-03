package org.halkidiki.petsapp.post;

import java.util.ArrayList;
import java.util.List;

import org.halkidiki.petsapp.accounts.Account;
import org.halkidiki.petsapp.accounts.User;

public class PetsittingManager {

	private List<Post> activePosts;
	private List<Post> inactivePosts;
	Petsitting petsittingpost = new Petsitting();

	public void deletePost(Post post) {
		activePosts.remove(post);
		inactivePosts.remove(post);
	}

	public void AcceptPetsittingReques(Petsitting post) {

		postNotLongerRequired(post);

	}

	public void AcceptPetsittingHelp(Account helpingUser) {
		
		helpingUser.setRewardPoints(petsittingpost.getRewardPoints());
	}

	

	private boolean isAPetsittingtPost(Post post) {
		return post instanceof Petsitting;
	}

	public List<Petsitting> getPostsOfPetsittingPets() {
		List<Petsitting> petsittingPostList = new ArrayList<Petsitting>();

		for (Post post : activePosts) {
			if (isAPetsittingtPost(post)) {
				petsittingPostList.add((Petsitting) post);
			}
		}

		return petsittingPostList;
	}

	private void postNotLongerRequired(Post post) {
		activePosts.remove(post);
		inactivePosts.add(post);
	}

	public List<Post> getPosts() {
		return activePosts;
	}

	public List<Post> getInactivePosts() {
		return inactivePosts;
	}
	

	

}
