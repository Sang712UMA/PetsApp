package org.halkidiki.petsapp.accounts;

import java.util.ArrayList;

import org.halkidiki.petsapp.FreeHours;

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
