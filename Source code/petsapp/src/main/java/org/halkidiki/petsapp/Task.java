package org.halkidiki.petsapp;

import java.util.ArrayList;
import java.util.Date;

import org.halkidiki.petsapp.accounts.Volunteer;

/**
 *
 * @author antek
 */
public class Task {
    private String description;
    private Date startHour;
    private Date endHour;
    private boolean completed;
    private Volunteer assignedVolunteer;
    
    public Task(String description, Date startHour, Date endHour, Volunteer assignedVolunteer){
        this.description = description;
        this.startHour = startHour;
        this.endHour = endHour;
        this.assignedVolunteer = assignedVolunteer;
    }
    
    public Task(String description, Date startHour, Date endHour){
        this(description, startHour, endHour, null);
    }
    
    public String getDescription(){
        return description;
    }
    
    public void setDescription(String description){
        this.description = description;
    }
    
    public void changeHours(Date startHour, Date endHour){
        this.startHour = startHour;
        this.endHour = endHour;
    }
    
    public Date getStartHour(){
        return startHour;
    }
    
    public Date getEndHour(){
        return endHour;
    }
    
    public void setCompleted(boolean completed){
        this.completed = completed;
    }
    
    public boolean getCompleted(){
        return completed;
    }
    
    public Volunteer getAssignedVolunteer(){
        return assignedVolunteer;
    }
    
    public void assignVolunteer(Volunteer assignedVolunteer){
        this.assignedVolunteer = assignedVolunteer;
        ArrayList<FreeHours> fhs = assignedVolunteer.getFreeHours();
        for(FreeHours fh : fhs){
            if(!startHour.before(fh.getStartDateTime())
                    && !endHour.after(fh.getStartDateTime())){
                
                assignedVolunteer.removeFreeHours(fh);
                if(!fh.startDateTime.equals(startHour)){
                    assignedVolunteer.addFreeHours(new FreeHours(fh.startDateTime, startHour));
                }
                if(!fh.endDateTime.equals(endHour)){
                    assignedVolunteer.addFreeHours(new FreeHours(fh.endDateTime, endHour));
                }
            }
        }
    }
}
