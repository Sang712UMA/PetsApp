package org.halkidiki.petsapp;

import java.util.ArrayList;
import java.util.List;

import org.halkidiki.petsapp.accounts.User;

/**
 * @author Sanggil Han
 */

public class Store {

	private List<Reward> rewardsInStore;
	private static Store activeStore=null;
	
	private Store() {
		rewardsInStore = new ArrayList<Reward>();
	}
	
	public static Store getActiveStore() {
		if(activeStore == null) {
			activeStore = new Store();
		}
		
		return activeStore;
	}
	
	public void buyReward(User user, Reward reward) {
		if(user.getPetPoint() >= reward.getRequiredPP()) {
			user.earnReward(reward);
			user.addPetPoint(-reward.getRequiredPP());
			System.out.println("You've bought \"" + reward.getTitle() + "\" successfully.");
		} 
		else {
			System.out.println("You don't have enough petpoint.");
		}
	}
	
	public void addReward(Reward Reward) {
		rewardsInStore.add(Reward);
	}
	
	public void deleteReward(Reward reward) {
		rewardsInStore.remove(reward);
	}
	
	/*GETTERS */
	
	public List<Reward> getrewardsInStore() {
		return rewardsInStore;
	}
	
}
