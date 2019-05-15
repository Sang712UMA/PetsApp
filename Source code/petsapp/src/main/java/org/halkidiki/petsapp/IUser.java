package org.halkidiki.petsapp;
import java.awt.Image;
import java.util.Date;
public class IUser {


	
	    private Date creationDate;
		private Image profilePicture;
		private int id, phoneNumber;
		private String street, city, email,  password, nickName;

		public IUser() {}
		
		@SuppressWarnings("unused")
		private void ownerFound(int owner) {
			if(owner == this.getId()) {
				
			}
		}

		private Date getCreationDate() {
			return creationDate;
		}

		private void setCreationDate(Date creationDate) {
			this.creationDate = creationDate;
		}

		private Image getProfilePicture() {
			return profilePicture;
		}

		private void setProfilePicture(Image profilePicture) {
			this.profilePicture = profilePicture;
		}

		private int getPhoneNumber() {
			return phoneNumber;
		}

		private void setPhoneNumber(int phoneNumber) {
			this.phoneNumber = phoneNumber;
		}

		private String getStreet() {
			return street;
		}

		private void setStreet(String street) {
			this.street = street;
		}

		private String getCity() {
			return city;
		}

		private void setCity(String city) {
			this.city = city;
		}

		private String getEmail() {
			return email;
		}

		private void setEmail(String email) {
			this.email = email;
		}

		private String getPassword() {
			return password;
		}

		private void setPassword(String password) {
			this.password = password;
		}

		public String getNickName() {
			return nickName;
		}

		public void setNickName(String nickName) {
			this.nickName = nickName;
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

}
