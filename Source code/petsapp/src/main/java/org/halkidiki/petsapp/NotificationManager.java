package org.halkidiki.petsapp;

public class NotificationManager {

	int[] test;
	final int SIZE = 100; // Test value
	int nItems;
	
	public NotificationManager() {
		test = new int[SIZE];
		nItems = 0;
	}
	
	public void addInteger (int number) {
		test[nItems] = number;
		nItems++;
	}
}
