package org.halkidiki.petsapp;

import java.util.Date;

/*
 * by Sanggil
 */

public class Reward {
	String title = "";
	String description = "";
	int requiredPP;
	Boolean	eStarted = false;
	Date eStartDate;
	Date eEndDate;
	String ePrize;
	
	Reward(){}
	Reward(String title, String description, int requiredPP, Boolean eStarted, Date eStartDate, Date eEndDate, String ePrize){
		this.title = title;
		this.description = description;
		this.requiredPP = requiredPP;
		this.eStarted = eStarted;
		this.eStartDate = eStartDate;
		this.eEndDate = eEndDate;
		this.ePrize = ePrize;
	}
	
	public void  eventEnd() {
		
	}
	public void givePrize()	{
		
	}
	
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
	public Boolean geteStarted() {
		return eStarted;
	}
	public void seteStarted(Boolean eStarted) {
		this.eStarted = eStarted;
	}
	public Date geteStartDate() {
		return eStartDate;
	}
	public void seteStartDate(Date eStartDate) {
		this.eStartDate = eStartDate;
	}
	public Date geteEndDate() {
		return eEndDate;
	}
	public void seteEndDate(Date eEndDate) {
		this.eEndDate = eEndDate;
	}
	public String getePrize() {
		return ePrize;
	}
	public void setePrize(String ePrize) {
		this.ePrize = ePrize;
	}
	
	
	
	
}
