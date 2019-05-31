package org.halkidiki.petsapp;

import java.util.Date;

public class Contest {
	private String title = "";
	private String description = "";
	private Boolean	cStarted = false;
	private Date cStartDate;
	private Date cEndDate;
	private Reward cPrize;
	private final int ONE_DAY_IN_MILLISEC = 86400000;

	
	public Contest(String title, String description, Boolean cStarted, Date cStartDate, Date cEndDate, Reward cPrize){
		this.title = title;
		this.description = description;
		this.cStarted = cStarted;
		this.cStartDate = cStartDate;
		this.cEndDate = cEndDate;
		this.cPrize = cPrize;
	}
	
	public void eventEnd() {
		cStarted = false;
	}
	public void givePrize()	{
		
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
}
