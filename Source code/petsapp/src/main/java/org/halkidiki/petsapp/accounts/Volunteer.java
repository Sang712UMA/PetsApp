package org.halkidiki.petsapp.accounts;

import java.util.ArrayList;

import org.halkidiki.petsapp.FreeHours;

/**
 *
 * @author antek
 */
public class Volunteer extends User{
    
    private ArrayList<FreeHours> freeHoursList = new ArrayList<>();
    private int tasksCompleted=0;
    
    public ArrayList<FreeHours> getFreeHours(){
        return freeHoursList;
    }
    
    public void addFreeHours(FreeHours freeHours){
        this.freeHoursList.add(freeHours);
    }
    
    public boolean removeFreeHours(FreeHours freeHours){
        return this.freeHoursList.remove(freeHours);
    }
    
    public void setTasksCompleted(int tasksCompleted){
        this.tasksCompleted = tasksCompleted;
    }
    
    public int getTasksCompleted(){
        return this.tasksCompleted;
    }
}
