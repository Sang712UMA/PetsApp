package org.halkidiki.petsapp.notifications;

import org.halkidiki.petsapp.Pet;
import org.halkidiki.petsapp.User;

public class MessageNotification extends Notification {

    String message;
    
    public MessageNotification(User user, String message){
        super(user);
        this.message = message;
    }

}
