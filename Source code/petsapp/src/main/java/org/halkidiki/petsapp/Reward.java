package org.halkidiki.petsapp;

/*
 * by Sanggil
 */

public class Reward {
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
	public Decimal getRequiredPP() {
		return requiredPP;
	}
	public void setRequiredPP(Decimal requiredPP) {
		this.requiredPP = requiredPP;
	}
	public Boolean geteStarted() {
		return eStarted;
	}
	public void seteStarted(Boolean eStarted) {
		this.eStarted = eStarted;
	}
	public Date geteStarDate() {
		return eStarDate;
	}
	public void seteStarDate(Date eStarDate) {
		this.eStarDate = eStarDate;
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
	String title = "";
	String description = "";
	Decimal requiredPP;
	Boolean	eStarted = false;
	Date eStarDate;
	Date eEndDate;
	String ePrize;
	
	public eventEnd() {
		
	}
	public givePrize()	{
		
	}
	
}
