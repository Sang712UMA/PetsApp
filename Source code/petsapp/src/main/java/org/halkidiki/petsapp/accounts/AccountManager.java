package org.halkidiki.petsapp.accounts;

import java.util.List;

/**
 * 
 * @Author: Adrian
 * 
 */

public class AccountManager {
	
	List<User> activeUsers;
	List<Administrator> activeAdministrators;
	List<Shelter> activeShelters;
	private static AccountManager activeAccountManager=null;
	
	private AccountManager() {
	}

	public static AccountManager getActiveAccountManager(){
		return null;
	}
	
	public List<User> getUsers() {
		return null;
	}
	
	public List<Administrator> getAdministrator(){
		return null;
	}
	
	public List<Shelter> getShelters(){
		return null;
	}
	
	public void addAccount(Account account) {
	}

	public void deleteAccount(Account account) {
	
	}
}
