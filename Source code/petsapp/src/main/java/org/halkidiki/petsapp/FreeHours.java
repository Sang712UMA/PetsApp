package org.halkidiki.petsapp;

import java.util.Date;

/**
 *
 * @author antek
 */
public class FreeHours {
    
    Date startDateTime;
    Date endDateTime;
    
    public FreeHours(Date startDateTime, Date endDateTime){
        this.startDateTime = startDateTime;
        this.endDateTime = endDateTime;
   }
    
    public void changeHours(Date startDateTime, Date endDateTime){
        this.startDateTime = startDateTime;
        this.endDateTime = endDateTime;
    }
    
    public Date getStartDateTime(){
        return startDateTime;
    }
    
    public Date getEndDateTime(){
        return endDateTime;
    }
    
}
