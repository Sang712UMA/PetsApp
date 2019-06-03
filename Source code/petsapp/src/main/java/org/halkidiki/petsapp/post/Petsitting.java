package org.halkidiki.petsapp.post;

import java.time.LocalDate;
import java.util.Date;

import org.halkidiki.petsapp.accounts.Account;

public class Petsitting extends Post {

	LocalDate startDate;
	private int duration;
	public static int rewardPoints;

	public Petsitting() {
	}

	public Petsitting(int duration, int rewardPoints,LocalDate startDate) {
		this.duration = duration;
		this.rewardPoints = rewardPoints;
		this.startDate = startDate;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public int getRewardPoints() {
		return rewardPoints;
	}

	public void setRewardPoints(int rewardPoints) {
		this.rewardPoints = rewardPoints;
	}
	
	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}

}
