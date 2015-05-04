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
public class Organizer {
    ArrayList<Note> database = new ArrayList<>();
    
    public Organizer addNote(Note s)
    {
        database.add(s);
        if (database.size() > 5) 
            database.remove(0);
        return this;
    }
    
    public int getSize()
    {
        return database.size();
    }
}
