package org.halkidiki.petsapp.conversation;

import java.util.ArrayList;

import org.halkidiki.petsapp.accounts.Account;

import javafx.util.Pair;

/**
 *
 * @author antek
 */
public class Conversation {
    
    private final Pair<Integer, Integer> participantsId;
    private ArrayList<Message> messages;
    
    public Conversation(int participant1Id, int participant2Id){
        if(participant1Id < participant2Id){
            this.participantsId = new Pair(participant1Id, participant2Id);
        } else {
            this.participantsId = new Pair(participant2Id, participant1Id);
        }
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
