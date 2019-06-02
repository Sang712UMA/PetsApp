package org.halkidiki.petsapp.accounts;

import org.halkidiki.petsapp.Contest;
import org.halkidiki.petsapp.ContestManager;
import org.halkidiki.petsapp.Reward;
import org.halkidiki.petsapp.Store;

import java.util.List;

/**
 * @author Sanggil Han
 * 
 */

public class Administrator extends Account {

	Contest contest;
	User user;
	AccountManager AM = AccountManager.getActiveAccountManager();
	public List<User> users = AM.getUsers();

	public Administrator(){
	}

	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Administrator(User user) {
		super();
		this.user = user;
	}

	public Contest getContest() {
		return contest;
	}

	public void createContest(Contest contest) {
		ContestManager.getActiveContestManager().addContest(contest);
	}

	public void deleteContest(Contest contest) {
		ContestManager.getActiveContestManager().deleteContest(contest);
	}

	public void updateContest() {
		ContestManager.getActiveContestManager().update();
	}
	
	public void addRewardToStore(Reward reward) {
		Store.getActiveStore().addReward(reward);
	}
	
	public void deleteRewardFromStore(Reward reward) {
		Store.getActiveStore().deleteReward(reward);
	}

	public void updateListOfUsers() {
		users = AM.getUsers();
	}
}
