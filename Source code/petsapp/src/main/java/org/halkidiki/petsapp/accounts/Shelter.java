package org.halkidiki.petsapp.accounts;

import java.awt.Image;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;

import org.halkidiki.petsapp.*;
import org.halkidiki.petsapp.conversation.ConversationManager;
import org.halkidiki.petsapp.conversation.Message;
import org.halkidiki.petsapp.notifications.NotificationManager;
import org.halkidiki.petsapp.notifications.TaskNotification;

/**
 *
 * @author antek
 */
public class Shelter extends Account{
    
    private ArrayList<Volunteer> shelterVolunteers;
    private ArrayList<Task> shelterTasks;
    
    public Shelter(Image profilePicture, int id, int phoneNumber, String street, String city, String email, String  password,String nickName){
        this.creationDate = new Date();
        this.profilePicture = profilePicture;
        this.id = id;
        this.phoneNumber = phoneNumber;
        this.street = street;
        this.city = city;
        this.email = email;
        this.password = password;
        this.nickName = nickName;
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
    
    public Volunteer searchForAvailableVolunteer(Task task){
        ArrayList<Volunteer> potentialVolunteers = shelterVolunteers;
        
        Collections.sort(potentialVolunteers, new Comparator<Volunteer>() {
            @Override
            public int compare(Volunteer v1, Volunteer v2) {
                return v1.getTasksCompleted() - v2.getTasksCompleted(); // Ascending
            }
        });
        
        for(Volunteer v : potentialVolunteers){
            for(FreeHours fh : v.getFreeHours()){
                if(!task.getStartHour().before(fh.getStartDateTime())
                        && !task.getEndHour().after(fh.getEndDateTime())){
                    return v;
                }
            }
        }
        return null;
    }
    
    public ArrayList<Task> listUnassignedTasks(){
        ArrayList<Task> unassignedTasks = new ArrayList();
        for(Task task : shelterTasks){
            if(task.getAssignedVolunteer()==null){
                unassignedTasks.add(task);
            }
        }
        return unassignedTasks;
    }
    
    public boolean assignAllTasks(){
        ArrayList<Task> unassignedTasks = listUnassignedTasks();
        boolean success = true;
        for(Task task : unassignedTasks){
            Volunteer v = searchForAvailableVolunteer(task);
            if(v == null){
                success = false;
            } else {
                task.assignVolunteer(v);
                sendTask(task, v);
            }
        }
        return success;
    }
    
    public void askVolunteerForAvailability(Task task){
        if(shelterVolunteers!=null && shelterVolunteers.isEmpty()==false){
            //Sort volunteers by their engagement:
            ArrayList<Volunteer> potentialVolunteers = shelterVolunteers;
            Collections.sort(potentialVolunteers, new Comparator<Volunteer>() {
                @Override
                public int compare(Volunteer v1, Volunteer v2) {
                    return v1.getTasksCompleted() - v2.getTasksCompleted(); // Ascending
                }
            });
            
            //Check if potential volunteers have other tasks assigned at this time, starting with the least engaged:
            boolean foundPotential = false;
            int iterator = -1;
            while(!foundPotential){
                iterator++;
                if(iterator<potentialVolunteers.size()){
                    potentialVolunteers.get(iterator);
                    foundPotential=true;
                    for(Task t : this.shelterTasks){
                        if(t.getAssignedVolunteer()==potentialVolunteers.get(iterator)
                                && t.getStartHour().before(task.getEndHour())
                                && t.getEndHour().after(task.getStartHour()))
                            foundPotential=false;
                    }
                } else {
                    return;
                }
            }
            
            Message message = new Message("Can you be available between "+task.getStartHour().toString()+" and "+task.getEndHour()+"?", this.id);
            ConversationManager.getActiveConversationManager().sendMessage(message, potentialVolunteers.get(iterator).getId());
        }
        
    }
    
    public void sendTask(Task task, Volunteer v){
        Message message = new Message("You have new task assigned: "+task.getDescription()+" To be completed between "+task.getStartHour().toString()+" and "+task.getEndHour().toString(), this.id);
        ConversationManager.getActiveConversationManager().sendMessage(message, v.getId());
        TaskNotification taskNotification = new TaskNotification(v, task);
        NotificationManager.getActiveNotificationManager().sendTaskNotification(taskNotification);
    }
    
}
