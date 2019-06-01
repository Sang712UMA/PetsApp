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

	public Account login (String username, String password) throws Exception {
		Account account = null;

		if(account == null ){
			account = loginOnShelter(username,password);
		}
		if(account == null){
			account = loginOnAdministrator(username,password);
		}
		if(account == null){
			account = loginOnUser(username,password);
		}
		if(account == null){
			throw new Exception("User not found!");
		}

		return account;
	}

	private Account loginOnShelter(String username, String password) throws Exception {
		Account account = null;
		for (Shelter shelter : activeShelters) {
			if(shelter.getNickName() == username) {
				if (shelter.checkPassword(password)) {
					account = shelter;
				} else {
					throw new Exception("Incorrect Password!");
				}
			}
		}
		return account;
	}

	private Account loginOnAdministrator(String username, String password) throws Exception {
		Account account = null;
		for (Administrator admin : activeAdministrators) {
			if(admin.getNickName() == username) {
				if (admin.checkPassword(password)) {
					account = admin;
				} else {
					throw new Exception("Incorrect Password!");
				}
			}
		}
		return account;
	}

	private Account loginOnUser(String username, String password) throws Exception {
		Account account = null;
		for (User user : activeUsers) {
			if(user.getNickName() == username) {
				if (user.checkPassword(password)) {
					account = user;
				} else {
					throw new Exception("Incorrect Password!");
				}
			}
		}
		return account;
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
