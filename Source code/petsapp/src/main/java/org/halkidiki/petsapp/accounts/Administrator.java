package org.halkidiki.petsapp.accounts;

import org.halkidiki.petsapp.Contest;
import org.halkidiki.petsapp.Reward;

import java.util.Date;
import java.util.List;

/*
 * by Sanggil
 */

public class Administrator extends Account {
	
	
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
	
	AccountManager AM = AccountManager.getActiveAccountManager();
	public List<User> users = AM.getUsers();
	public void checkTotaltime() {
		String output = "";
		
		int[] timeRank = new int[users.size()];
		int[] rank = new int[users.size()];
		
		for(int i = 0; i<users.size(); i++) {
			timeRank[i] = users.get(i).getcTimeDevoted();
			rank[i] = i;
		}
		heapSort(timeRank, rank);
		
		for(int i = 0; i < users.size(); i++)
		output += "Num" + i + " is \""+ users.get(rank[i]).getNickName() + 
					"\" who is devoted for " + users.get(rank[i]).getcTimeDevoted() + "hours.\n";
		
		System.out.println(output);
	}
	
	public void setContest(String title, String description, Boolean cStarted, Date cStartDate, Date cEndDate, Reward cPrize){
		contest.setTitle(title);
		contest.setDescription(description);
		contest.setcStarted(cStarted);
		contest.setcStartDate(cStartDate);
		contest.setcEndDate(cEndDate);
		contest.setcPrize(cPrize);
	}
	
	public void setWinner(String nickname) {
		for(User user : users) {
			if (user.getNickName()==nickname) contest.setWinner(user);
			else {
				System.out.println("There's no" + nickname + ".");
			}
		}
		
	}
	
	
	static void heapify(int[] array, int length, int i, int[] rank) {  
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
	        
	        int rankNum = rank[i];
	        rank[i] = rank[largest];
	        rank[largest] = rankNum;
	        heapify(array, length, largest, rank);
	    }
	}

	public static void heapSort(int[] array, int[] rank) {  
	    if (array.length == 0) return;

	    // Building the heap
	    int length = array.length;
	    // we're going from the first non-leaf to the root
	    for (int i = length / 2-1; i >= 0; i--)
	        heapify(array, length, i, rank);

	    for (int i = length-1; i >= 0; i--) {
	        int temp = array[0];
	        array[0] = array[i];
	        array[i] = temp;
	        
	        int rankNum = rank[0];
	        rank[0] = rank[i];
	        rank[i] = rankNum;

	        heapify(array, i, 0, rank);
	    }
	}
}
