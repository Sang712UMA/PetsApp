package org.halkidiki.petsapp.accounts;

import java.util.ArrayList;

import org.halkidiki.petsapp.*;

/**
 *
 * @author antek
 */
public class Shelter extends Account{
    
    private ArrayList<Volunteer> shelterVolunteers;
    private ArrayList<Task> shelterTasks;
    
    public Shelter(){
        
    }
    
    public ArrayList<Volunteer> listVolunteers(){
        return shelterVolunteers;
    }
    
    public void addVolunteer(Volunteer volunteer){
        this.shelterVolunteers.add(volunteer);
    }
    
    public boolean removeVolunteer(Volunteer volunteer){
        return this.shelterVolunteers.remove(volunteer);
    }
    
    public ArrayList<Task> listTasks(){
        return shelterTasks;
    }
    
    public void addTask(Task task){
        this.shelterTasks.add(task);
    }
    
    public boolean removeTask(Task task){
        return this.shelterTasks.remove(task);
    }
    
    public void sendMessage(String text){
        
    }
    
    public void sendTask(ArrayList<Task> taskList){
        
    }
    
}
