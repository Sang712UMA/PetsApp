package org.halkidiki.petsapp.accounts;

import java.awt.Image;
import java.util.Date;

public abstract class Account {

    Date creationDate;
    Image profilePicture;
    int id, phoneNumber;
    String street, city, email, nickName;
    protected String password; // Adrian (Private brings a error on User class)
    
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
    
    public boolean checkPassword(String password) { // Adrian
    	return this.password.equalsIgnoreCase(password);
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
}
