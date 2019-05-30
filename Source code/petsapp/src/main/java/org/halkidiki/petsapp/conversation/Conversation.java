package org.halkidiki.petsapp.conversation;

import java.util.ArrayList;
import org.halkidiki.petsapp.Account;

/**
 *
 * @author antek
 */
public class Conversation {
    
    private Account participant1;
    private Account participant2;
    private ArrayList<Message> messages;
    
    public Conversation(Account participant1, Account participant2){
        this.participant1 = participant1;
        this.participant2 = participant2;
    }
    
    public ArrayList<Message> loadConversation(){
        return messages;
    }
    
    public void sendMessage(Message message, int authorID){
        if(authorID==participant1.getID()){
            message.setAuthor(1);
        } else {
            message.setAuthor(2);
        }
        messages.add(message);
    }
    
}
