package org.halkidiki.petsapp.Algorithms;

import java.util.List;

import org.halkidiki.petsapp.accounts.User;

public class HeapsortUsersContest {
	
	static void heapify(List<User> array, int length, int i) {  
	    int leftChild = 2*i+1;
	    int rightChild = 2*i+2;
	    int largest = i;

	    // if the left child is larger than parent
	    if (leftChild < length && array.get(leftChild).getContestTimeDevoted()> array.get(largest).getContestTimeDevoted()) {
	        largest = leftChild;
	    }

	    // if the right child is larger than parent
	    if (rightChild < length && array.get(rightChild).getContestTimeDevoted()> array.get(largest).getContestTimeDevoted()) {
	        largest = rightChild;
	    }

	    // if a swap needs to occur
	    if (largest != i) {
	        User temp = array.get(i);
	        array.set(i, array.get(largest));
	        array.set(largest, temp);

	        
	        heapify(array, length, largest);
	    }
	}
	
	//This sort gives you result from lowest to highest.
	public static void heapSort(List<User> array) {  
	    if (array.size() == 0) return;

	    // Building the heap
	    int length = array.size();
	    // we're going from the first non-leaf to the root
	    for (int i = length / 2-1; i >= 0; i--)
	        heapify(array, length, i);

	    for (int i = length-1; i >= 0; i--) {
	        User temp = array.get(0);
	        array.set(0, array.get(i));
	        array.set(i, temp);

	        heapify(array, i, 0);
	    }
	}
}
