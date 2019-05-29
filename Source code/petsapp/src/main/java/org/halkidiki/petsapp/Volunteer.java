package org.halkidiki.petsapp;

import java.util.ArrayList;

/**
 *
 * @author antek
 */
public class Volunteer extends User{
    
    private ArrayList<FreeHours> freeHoursList;
    
    public ArrayList<FreeHours> getFreeHours(){
        return freeHoursList;
    }
    
    public void addFreeHours(FreeHours freeHours){
        this.freeHoursList.add(freeHours);
    }
    
    public boolean removeFreeHours(FreeHours freeHours){
        return this.freeHoursList.remove(freeHours);
    }
    
    public void sendMessage(String text){
        
    }
    
}
