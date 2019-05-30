package org.halkidiki.petsapp.conversation;

import java.util.ArrayList;
import javafx.util.Pair;
import org.halkidiki.petsapp.Account;

/**
 *
 * @author antek
 */
public class Conversation {
    
    private final Pair<Integer, Integer> participantsId;
    private ArrayList<Message> messages;
    
    public Conversation(int participant1Id, int participant2Id){
        this.participantsId = new Pair(participant1Id, participant2Id);
    }
    
    public Pair<Integer, Integer> getParticipantsId(){
        return participantsId;
    }
    
    public ArrayList<Message> loadMessagesFrom(){
        return messages;
    }
    
    public void sendMessage(Message message){
        messages.add(message);
    }
    
}
