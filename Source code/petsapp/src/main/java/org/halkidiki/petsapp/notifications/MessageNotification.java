package org.halkidiki.petsapp.notifications;

import org.halkidiki.petsapp.Pet;
import org.halkidiki.petsapp.accounts.User;

public class MessageNotification extends Notification {

    String message;
    
    public MessageNotification(User user, String message){
        super(user);
        this.message = message;
    }
    
    public String getMessage() {
    	return message;
    }
}
