package org.halkidiki.petsapp;


/*
 * by Sanggil
 */

public class Reward {
	private String title = "";
	private String description = "";
	private int requiredPP;
	private final int ONE_DAY_IN_MILLISEC = 86400000;

	
	public Reward(String title, String description, int requiredPP){
		this.title = title;
		this.description = description;
		this.requiredPP = requiredPP;
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
	public int getRequiredPP() {
		return requiredPP;
	}
	public void setRequiredPP(int requiredPP) {
		this.requiredPP = requiredPP;
	}
}
