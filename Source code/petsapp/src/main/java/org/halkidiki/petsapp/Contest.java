package org.halkidiki.petsapp;

import java.util.Date;
import java.util.List;

import org.halkidiki.petsapp.accounts.AccountManager;
import org.halkidiki.petsapp.accounts.User;

public class Contest {
	private String title = "";
	private String description = "";
	private Boolean	cStarted = false;
	private Date cStartDate;
	private Date cEndDate;
	private Reward cPrize;
	private AccountManager AM = AccountManager.getActiveAccountManager();
	private List<User> winner = AM.getUsers();
//	private final int ONE_DAY_IN_MILLISEC = 86400000;

	
	Contest(String title, String description, Boolean cStarted, Date cStartDate, Date cEndDate, Reward cPrize){
		this.title = title;
		this.description = description;
		this.cStarted = cStarted;
		this.cStartDate = cStartDate;
		this.cEndDate = cEndDate;
		this.cPrize = cPrize;
	}
	
	public void contestEnd() {
		cStarted = false;
	}
	public void givePrize(Reward reward)	{
		for(User user : winner) {
			user.earnReward(reward);
		}
		contestEnd();
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
	public Boolean getcStarted() {
		return cStarted;
	}
	public void setcStarted(Boolean cStarted) {
		this.cStarted = cStarted;
	}
	public Date getcStartDate() {
		return cStartDate;
	}
	public void setcStartDate(Date cStartDate) {
		this.cStartDate = cStartDate;
	}
	public Date getcEndDate() {
		return cEndDate;
	}
	public void setcEndDate(Date cEndDate) {
		this.cEndDate = cEndDate;
	}
	public Reward getcPrize() {
		return cPrize;
	}
	public void setcPrize(Reward cPrize) {
		this.cPrize = cPrize;
	}
	public void setWinner(User winner) {
		this.winner.add(winner);
	}
}
