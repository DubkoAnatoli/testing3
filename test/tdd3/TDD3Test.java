/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tdd3;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Dialia
 */
public class TDD3Test {
    
    public TDD3Test() {
    }
    
    @Test
    public void creatingOfNewNote() {
        Organizer o = new Organizer();
        Note n = new Note("title");
        o.addNote(n);
        int result = o.getSize();
        assertEquals(true, result > 0);
    } 
    
    @Test
    public void creatingOfNewMessageIntoNote() {
        Organizer o = new Organizer();
        Note n = new Note("title");
        Message m = new Message("message");
        n.addMessage(m);
        o.addNote(n);
        int result = n.getSize();
        assertEquals(true, result > 0);
    } 
    
    @Test
    public void creatingOfNewMessageAsListIntoNote() {
        Organizer o = new Organizer();
        Note n = new Note("title");
        Message m = new Message("message").asList();
        n.addMessage(m);
        o.addNote(n);
        int result = m.getText().indexOf("\t-");
        assertEquals(true, result > -1);
    }
    
    @Test
    public void max5NotesInOrganizerCycledRemove() {
        Organizer o = new Organizer();
        Note n = new Note("title");
        o.addNote(n).addNote(n).addNote(n).addNote(n).addNote(n).addNote(n);
        int result = o.getSize();
        assertEquals(true, result == 5);
    }
    
    @Test
    public void getStringsOfNote() {
        Note n = new Note("title");
        n.addMessage(new Message("1")).addMessage(new Message("2")).addMessage(new Message("3"));
        String result = n.getStrings();
        String expResult = 
                "1\n"
                + "2\n"
                + "3\n";
        assertEquals(expResult, result);
    }
}
