package org.halkidiki.petsapp.conversation;

import java.util.Date;

/**
 *
 * @author antek
 */
public class Message {
    
    private Date sentDate;
    private String text;
    private int authorId;
    
    public Message(String text, int authorId){
        this.text = text;
        this.authorId = authorId;
        sentDate = new Date();
    }
    
    public Date getSentDate(){
        return sentDate;
    }
    
    public String getText(){
        return text;
    }
    
    public int getAuthorId(){
        return authorId;
    }
    
}
