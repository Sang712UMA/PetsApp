package org.halkidiki.petsapp;

import java.util.Date;

public interface IUser {
	private Date creationDate;
	private image profilePicture;
	private int id, phoneNumber;
	private String street, city, email,  password, nickName;

	
	private void ownerFound(int owner) {
		if(owner == this.id) {
			
		}
	}
}
