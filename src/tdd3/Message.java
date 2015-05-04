/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tdd3;

/**
 *
 * @author Dialia
 */
public class Message {
    String text;
    public Message(String s)
    {
        text = s;
    }
    
    public Message asList()
    {
        text = "\t- " + text;
        return this;
    }
    
    public String getText()
    {
        return text;
    }   
}
