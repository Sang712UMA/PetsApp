package org.halkidiki.petsapp.post;

import java.util.ArrayList;
import java.util.List;

import org.halkidiki.petsapp.accounts.Account;
import org.halkidiki.petsapp.accounts.User;
import org.halkidiki.petsapp.conversation.ConversationManager;
import org.halkidiki.petsapp.conversation.Message;

public class PetsittingManager {

	PostManager pm = PostManager.getActivePostManager();
	Petsitting ps = new Petsitting();
	ConversationManager cm = ConversationManager.getActiveConversationManager();

	public void addPetsittingRequest(Petsitting ps) {

		pm.addPost(ps);
	}

	public void acceptPetsittingRequest(Message message) {

		cm.sendMessage(message, ps.getPet().getUserId());
		pm.postNotLongerRequired(ps);
	}


	private void sendReward(Account petsitter) {
		petsitter.updateRewardPoints(ps.getRewardPoints());
	}

}
