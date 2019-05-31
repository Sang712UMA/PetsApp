package org.halkidiki.petsapp.accounts;
import java.awt.Image;
import java.util.Date;

import org.halkidiki.petsapp.Pet;
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
		public int eTimeDevoted = 0;

		public void addTimeDevoted(int timeDevoted) {
			totalTimeDevoted += timeDevoted;
		}
		public void addETimeDevoted(int timeDevoted, Reward reward) {
			if(reward.eStarted == true) {
				eTimeDevoted += timeDevoted;
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
		
		
		/*
		 * to this line coded by Sanggil
		 */
}
