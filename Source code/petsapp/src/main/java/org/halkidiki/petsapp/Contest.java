package org.halkidiki.petsapp;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.halkidiki.petsapp.Algorithms.HeapsortUsersContest;
import org.halkidiki.petsapp.accounts.AccountManager;
import org.halkidiki.petsapp.accounts.User;

/**
 * @author Sanggil Han
 */

public class Contest {
	private String title;
	private String description;
	private Boolean	contestIsRunning;
	private Date contestStartDate;
	private Date contestEndDate;
	private Reward contestReward;
	private int numWinners;
	private List<User> usersInTheContest;

	//	private final int ONE_DAY_IN_MILLISEC = 86400000;


	public Contest(String title, String description, Boolean contestIsRunning, Date contestStartDate, Date contestEndDate, 
			Reward contestReward, int numWinners){
		this.title = title;
		this.description = description;
		this.contestIsRunning = contestIsRunning;
		this.contestStartDate = contestStartDate;
		this.contestEndDate = contestEndDate;
		this.contestReward = contestReward;
		this.numWinners = numWinners;
	}

	public void contestEnd() {
		setWinners();
		contestIsRunning = false;
	}
	
	//This method return winners in the console.
	private void setWinners() {
		addAllUsers();
		sortUsers();

		for(int i=usersInTheContest.size() - 1; i> usersInTheContest.size() - 1 - numWinners; i--) {
			System.out.println("The #" + (numWinners-i+1) + " is " 
					+ usersInTheContest.get(i).toString() + " who devoted " 
					+ usersInTheContest.get(i).getContestTimeDevoted() + "hours.");
			giveReward(usersInTheContest.get(i));
		}
	}

	private void addAllUsers() {
		AccountManager AM = AccountManager.getActiveAccountManager();
		usersInTheContest = new ArrayList<User>(AM.getUsers());
	}

	private void sortUsers() {
		HeapsortUsersContest.heapSort(usersInTheContest);
	}


	private void giveReward(User user)	{
		user.earnReward(contestReward);
	}


	/*	
	 *	getters & setters
	 */
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Boolean getContestStarted() {
		return contestIsRunning;
	}
	public void setContestStarted(Boolean contestStarted) {
		this.contestIsRunning = contestStarted;
	}
	public Date getContestStartDate() {
		return contestStartDate;
	}
	public void setContestStartDate(Date contestStartDate) {
		this.contestStartDate = contestStartDate;
	}
	public Date getContestEndDate() {
		return contestEndDate;
	}
	public void setContestEndDate(Date contestEndDate) {
		this.contestEndDate = contestEndDate;
	}
	public Reward getContestReward() {
		return contestReward;
	}
	public void setContestReward(Reward reward) {
		this.contestReward = reward;
	}
	public int getNumWinners() {
		return numWinners;
	}
	public void setNumWinners(int numWinners) {
		this.numWinners = numWinners;
	}
}
