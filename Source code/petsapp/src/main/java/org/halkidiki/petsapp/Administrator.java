package org.halkidiki.petsapp;

import java.util.Date;

/*
 * by Sanggil
 */
import org.halkidiki.petsapp.Reward;

public class Administrator extends IUser{
	
	
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
	
	IUser user;
	public IUser getUser() {
		return user;
	}
	public void setUser(IUser user) {
		this.user = user;
	}
	public Administrator(IUser user) {
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
		if (IUser.getNickName()==nickname) return nickname;
		else {
			System.out.println("There's no" + nickname + ".");
			return null;
		}
	}
}
