package org.halkidiki.petsapp;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

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
	
	public static List<User> timeRanker = new ArrayList<User>();
	public void checkTotaltime() {
		String output = null;
		List<User> eligibleUser = Account.activeUsers;
		for(User user : eligibleUser) {
			
			if (eligibleUser.)
		}
		
	}
	
	public void setEvent(Date startdate, Date enddate) {
		 reward.seteStarted(true);
		 reward.seteStartDate(startdate);
		 reward.seteEndDate(enddate);
	}
	
	public String setWinner(String nickname) {
		String output = null;
		List<User> eligibleUser = Account.activeUsers;
		for(User user : eligibleUser) {
			if (user.getNickName()==nickname) output = nickname;
			else {
				System.out.println("There's no" + nickname + ".");
				output = null;
			}
		}
		return output;
		
	}
	
	
}
