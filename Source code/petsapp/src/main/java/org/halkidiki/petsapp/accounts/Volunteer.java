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
        for(FreeHours fh : this.freeHoursList){
            if(freeHours.getStartDateTime().after(fh.getStartDateTime())
                    && freeHours.getStartDateTime().before(fh.getEndDateTime())){
                if(freeHours.getEndDateTime().after(fh.getEndDateTime())){
                    removeFreeHours(fh);
                    removeFreeHours(freeHours);
                    addFreeHours(new FreeHours(fh.getStartDateTime(), freeHours.getEndDateTime()));
                } else {
                    removeFreeHours(freeHours);
                }
            }
            
            if(freeHours.getEndDateTime().after(fh.getStartDateTime())
                    && freeHours.getEndDateTime().before(fh.getEndDateTime())){
                if(freeHours.getStartDateTime().before(fh.getStartDateTime())){
                    removeFreeHours(fh);
                    removeFreeHours(freeHours);
                    addFreeHours(new FreeHours(fh.getStartDateTime(), freeHours.getEndDateTime()));
                } else {
                    removeFreeHours(freeHours);                    
                }
            }
        }
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
