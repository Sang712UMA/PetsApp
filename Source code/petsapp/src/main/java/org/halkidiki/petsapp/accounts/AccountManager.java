package org.halkidiki.petsapp.accounts;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @Author: Adrian
 * 
 */

public class AccountManager {
	
	private List<User> activeUsers;
	private List<Administrator> activeAdministrators;
	private List<Shelter> activeShelters;
	private static AccountManager activeAccountManager=null;
	
	private AccountManager() {
		activeUsers = new ArrayList<User>();
		activeAdministrators = new ArrayList<Administrator>();
		activeShelters = new ArrayList<Shelter>();
	}

	public static AccountManager getActiveAccountManager(){
		if(activeAccountManager == null) {
			activeAccountManager = new AccountManager();
		}
		return activeAccountManager;
	}
	
	public void addAccount(User user) {
		activeUsers.add(user);
	}
	
	public void addAccount(Administrator administrator) {
		activeAdministrators.add(administrator);
	}
	
	public void addAccount(Shelter shelter) {
		activeShelters.add(shelter);
	}

	public void deleteAccount(User user) {
		activeUsers.remove(user);
	}
	
	public void deleteAccount(Administrator administrator) {
		activeAdministrators.remove(administrator);
	}
	
	public void deleteAccount(Shelter shelter) {
		activeShelters.remove(shelter);
	}

	/*GETTERS*/
	public List<User> getUsers() {
		return activeUsers;
	}
	
	public List<Administrator> getAdministrators(){
		return activeAdministrators;
	}
	
	public List<Shelter> getShelters(){
		return activeShelters;
	}
}
