package org.halkidiki.petsapp;
import java.awt.Image;
import java.util.Date;
public class User{ //Konstantina


	
	    private Date creationDate;
		private Image profilePicture;
		private int id, phoneNumber;
		private String street, city, email,  password, nickName;
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

		public Date getCreationDate() { //Konstantina 
			return creationDate;
		}

		public void setCreationDate(Date creationDate) { //Konstantina 
			this.creationDate = creationDate;
		}

		public Image getProfilePicture() { //Konstantina 
			return profilePicture; 
		}

		public void setProfilePicture(Image profilePicture) { //Konstantina 
			this.profilePicture = profilePicture;
		}

		public int getPhoneNumber() { //Konstantina 
			return phoneNumber;
		}

		public void setPhoneNumber(int phoneNumber) { //Konstantina 
			this.phoneNumber = phoneNumber;
		}

		public String getStreet() { //Konstantina 
			return street;
		}

		public void setStreet(String street) { //Konstantina 
			this.street = street;
		}

		public String getCity() { //Konstantina 
			return city;
		}

		public void setCity(String city) { //Konstantina 
			this.city = city;
		}

		public String getEmail() { //Konstantina 
			return email;
		}

		public void setEmail(String email) { //Konstantina 
			this.email = email;
		}

		@SuppressWarnings("unused")
		private String getPassword() { //Konstantina 
			return password;
		}

		@SuppressWarnings("unused")
		private void setPassword(String password) { //Konstantina 
			this.password = password;
		}

		public String getNickName() { //Konstantina 
			return nickName;
		}

		public void setNickName(String nickName) { //Konstantina 
			this.nickName = nickName;
		}

		public int getId() { //Konstantina 
			return id;
		}

		public void setId(int id) { //Konstantina 
			this.id = id;
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
