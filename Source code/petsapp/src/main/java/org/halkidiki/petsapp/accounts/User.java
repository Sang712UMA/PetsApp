package org.halkidiki.petsapp.accounts;
import java.awt.Image;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.halkidiki.petsapp.Pet;
import org.halkidiki.petsapp.Contest;
import org.halkidiki.petsapp.Reward;
public class User extends Account{ //Konstantina


	
	    
		Pet pet1 = new Pet();
		User theowner = null;
		public User() {}
		
		public User(Date creationDate,Image profilePicture, int id, int phoneNumber, String street, String city, String email, String  password,String nickName) { //Konstantina 
			this.creationDate = creationDate;
			this.profilePicture = profilePicture;
			this.id = id;
			this.phoneNumber = phoneNumber;
			this.street = street;
			this.city = city;
			this.email = email;
			this.password = password;
			this.nickName = nickName;
		}
		
		@SuppressWarnings("unused")
		private String ownerFound(int owner) { //Konstantina 
			String found = "Not found";
			if(owner == theowner.getId()) {
				found = "Found";
			}
			return found;
		}

		
		/*
		 * from this line coded by Sanggil
		 */
		
		public int expPoint = 0;
		public int petPoint = 0;
		public int totalTimeDevoted = 0;
		public int cTimeDevoted = 0;
		private List<Reward> earnedReward = new ArrayList<Reward>();

		public void addTimeDevoted(int timeDevoted) {
			totalTimeDevoted += timeDevoted;
		}
		public void addcTimeDevoted(int timeDevoted, Contest contest) {
			if(contest.getcStarted() == true) {
				cTimeDevoted += timeDevoted;
			}
		}
		public void addExpPoint(int expPoint) {
			this.expPoint += expPoint;
			if(this.expPoint<0)
				this.expPoint = 0;
		}
		public void addPetPoint(int petPoint) {
			this.petPoint += petPoint;
			if(this.petPoint<0)
				this.petPoint=0;
		}
		public void buyReward(Reward reward) {
			if(reward != null)
			if(petPoint>=reward.getRequiredPP()) {
				petPoint -= reward.getRequiredPP();
				earnReward(reward);
				System.out.println("You've bought \"" + reward.getTitle() + "\" successfully.");
			}
			else {
				//this one would be better if it is a notification
				System.out.println("You don't have enough petpoint.");
			}
		}
		
		public int getcTimeDevoted() {
			return cTimeDevoted;
		}
		public int gettotalTimeDevoted() {
			return totalTimeDevoted;
		}
		public int getexpPoint() {
			return expPoint;
		}
		public int getpetPoint() {
			return petPoint;
		}
		public void earnReward(Reward reward) {
			earnedReward.add(reward);
		}
		public Reward getEarnedReward(int num) {
			return earnedReward.get(num);
		}
		/*
		 * to this line coded by Sanggil
		 */
		
		public String toString() { //Adrian
			return nickName;
		}
}
