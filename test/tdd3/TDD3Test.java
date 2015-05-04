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
}
