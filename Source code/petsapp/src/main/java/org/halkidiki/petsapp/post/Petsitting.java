package org.halkidiki.petsapp.post;

import java.util.Date;

public class Petsitting extends Post {

	private int duration;
	

	public Petsitting(int duration) {
		this.duration = duration;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	

	
}
