package org.halkidiki.petsapp.post;

import java.util.Date;

public class Petsitting extends Post {

	private int duration;
	public static int rewardPoints;
	

	public Petsitting() {}
	
	public Petsitting(int duration, int rewardPoints) {
		this.duration = duration;
		this.rewardPoints = rewardPoints;
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
	
	
	

	
}
