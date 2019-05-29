package org.halkidiki.petsapp;

import java.util.ArrayList;

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
        return new ArrayList<Volunteer>();
    }    
    
    public void sendMessage(String text){
        
    }
    
    public void sendTask(ArrayList<Task> taskList){
        
    }
    
}
