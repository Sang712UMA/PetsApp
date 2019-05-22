package org.halkidiki.petsapp;
import java.awt.Image;
import java.util.Date;
public class IUser {


	
	    private Date creationDate;
		private Image profilePicture;
		private int id, phoneNumber;
		private String street, city, email,  password, nickName;
		Pet pet1 = new Pet();
		IUser theowner = new IUser();
		public IUser() {}
		
		@SuppressWarnings("unused")
		private String ownerFound(int owner) {
			String found = "Not found";
			if(owner == theowner.getId()) {
				found = "Found";
			}
			return found;
		}

		public Date getCreationDate() {
			return creationDate;
		}

		public void setCreationDate(Date creationDate) {
			this.creationDate = creationDate;
		}

		public Image getProfilePicture() {
			return profilePicture;
		}

		public void setProfilePicture(Image profilePicture) {
			this.profilePicture = profilePicture;
		}

		public int getPhoneNumber() {
			return phoneNumber;
		}

		public void setPhoneNumber(int phoneNumber) {
			this.phoneNumber = phoneNumber;
		}

		public String getStreet() {
			return street;
		}

		public void setStreet(String street) {
			this.street = street;
		}

		public String getCity() {
			return city;
		}

		public void setCity(String city) {
			this.city = city;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		@SuppressWarnings("unused")
		private String getPassword() {
			return password;
		}

		@SuppressWarnings("unused")
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
