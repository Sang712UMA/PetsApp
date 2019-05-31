package org.halkidiki.petsapp.accounts;

import org.halkidiki.petsapp.App;
import org.halkidiki.petsapp.Contest;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/*
 * by Sanggil
 */

public class Administrator extends Account{
	
	
	Contest contest;
	Administrator(){}
	public Contest getContest() {
		return contest;
	}
	public void setContest(Contest contest) {
		this.contest = contest;
	}
	public Administrator(Contest contest) {
		super();
		this.contest = contest;
	}
	
	User user;
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Administrator(User user) {
		super();
		this.user = user;
	}
//	AccountManager AM = AccountManager.getActiveAccountManager();
//	public List<User> users = AM.getUsers();
//	private void checkTotaltime() {
//		String output = null;
//		List<User> timeRanker = new ArrayList<User>();
//		int[] rank = new int[users.size()] ;
//		for(int i = 0; i<users.size(); i++) {
//			rank[i] = users i.getTimeDevoted();
//			
//		}
//	}
		
	
	public void setEvent(Date startdate, Date enddate) {
		 contest.setcStarted(true);
		 contest.setcStartDate(startdate);
		 contest.setcEndDate(enddate);
	}
	
//	public String setWinner(String nickname) {
//		String output = null;
//		List<User> eligibleUser = Account.activeUsers;
//		for(User user : eligibleUser) {
//			if (user.getNickName()==nickname) output = nickname;
//			else {
//				System.out.println("There's no" + nickname + ".");
//				output = null;
//			}
//		}
//		return output;
//		
//	}
	
	
	static void heapify(int[] array, int length, int i) {  
	    int leftChild = 2*i+1;
	    int rightChild = 2*i+2;
	    int largest = i;

	    // if the left child is larger than parent
	    if (leftChild < length && array[leftChild] > array[largest]) {
	        largest = leftChild;
	    }

	    // if the right child is larger than parent
	    if (rightChild < length && array[rightChild] > array[largest]) {
	        largest = rightChild;
	    }

	    // if a swap needs to occur
	    if (largest != i) {
	        int temp = array[i];
	        array[i] = array[largest];
	        array[largest] = temp;
	        heapify(array, length, largest);
	    }
	}

	public static void heapSort(int[] array) {  
	    if (array.length == 0) return;

	    // Building the heap
	    int length = array.length;
	    // we're going from the first non-leaf to the root
	    for (int i = length / 2-1; i >= 0; i--)
	        heapify(array, length, i);

	    for (int i = length-1; i >= 0; i--) {
	        int temp = array[0];
	        array[0] = array[i];
	        array[i] = temp;

	        heapify(array, i, 0);
	    }
	}
}
