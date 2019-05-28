package org.halkidiki.petsapp;

import java.util.Date;

/*
 * by Sanggil
 */
import org.halkidiki.petsapp.Reward;

public class Administrator extends User{
	
	
	Reward reward;
	Administrator(){}
	public Reward getReward() {
		return reward;
	}
	public void setReward(Reward reward) {
		this.reward = reward;
	}
	public Administrator(Reward reward) {
		super();
		this.reward = reward;
	}
	
	User user;
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
	
	
	public void checkTotaltime() {
		
		
	}
	
	public void setEvent(Date startdate, Date enddate) {
		 reward.seteStarted(true);
		 reward.seteStartDate(startdate);
		 reward.seteEndDate(enddate);
	}
	
	public String setWinner(String nickname) {
		if (Account.getNickName()==nickname) return nickname;
		else {
			System.out.println("There's no" + nickname + ".");
			return null;
		}
	}
	
	
}
