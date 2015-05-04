/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tdd3;

import java.util.ArrayList;

/**
 *
 * @author Dialia
 */
public class Note {
    String title;
    ArrayList<Message> messages = new ArrayList<>();
    
    public Note(String tit)
    {
        title = tit;
    }
    
    public Note addMessage(Message s)
    {
        messages.add(s);
        return this;
    }
    
    public int getSize()
    {
        return messages.size();
    }
}
