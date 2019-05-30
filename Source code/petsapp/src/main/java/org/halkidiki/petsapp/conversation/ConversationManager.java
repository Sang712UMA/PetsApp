package org.halkidiki.petsapp.conversation;

import java.util.ArrayList;
import javafx.util.Pair;

/**
 *
 * @author antek
 */
public class ConversationManager {
    
    private static ConversationManager activeConversationManager=null;
    private ArrayList<Conversation> conversations;
    
    private ConversationManager() {
	activeConversationManager = this;
    }
	
    public static ConversationManager getActiveConversationManager() {
        if(activeConversationManager==null){
            activeConversationManager= new ConversationManager();
        }
        return activeConversationManager;
    }
    
    public void sendMessage(Message message, int receiverId){
        Pair<Integer, Integer> messageParticipantsId = new Pair(message.getAuthorId(), receiverId);
        for(Conversation conversation : conversations){
            Pair<Integer, Integer> conversationParticipantsId = conversation.getParticipantsId();
            if(messageParticipantsId.getKey() == conversationParticipantsId.getKey()
                    && messageParticipantsId.getValue() == conversationParticipantsId.getValue()
                    || messageParticipantsId.getKey() == conversationParticipantsId.getValue()
                    && messageParticipantsId.getValue() == conversationParticipantsId.getKey())
                conversation.sendMessage(message);
        }
    }
    
}
