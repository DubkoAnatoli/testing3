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
public class Email {
    String url;
    public Email(String s)
    {
        url = s;
    }
    
    public Email usePOP3()
    {
        return this;
    }
}
