/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tdd3;

import java.util.Scanner;

/**
 *
 * @author Dialia
 */
public class TDD3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner inInteger = new Scanner(System.in);
        Scanner inString = new Scanner(System.in);
        Organizer o = new Organizer();
        int choose;
        do{
            String result = o.getTitles();
            System.out.print(result);
            System.out.println("5 - Добавить заметку");
            System.out.println("6 - Выход");
            System.out.print("Выбор: ");
            choose = inInteger.nextInt();
            System.out.println();
            if(choose < o.getSize())
            {
                int flag;
                do{
                    Note cur = o.getNoteByIndex(choose);
                    System.out.println(cur.getTitle().toUpperCase());
                    System.out.println(cur.getStrings());
                    System.out.println("0 - Добавить запись");
                    System.out.println("1 - Добавить запись как пункт списка");
                    System.out.println("2 - Отправить по E-MAIL (POP3)");
                    System.out.println("3 - Выход");
                    System.out.print("Выбор: ");
                    flag = inInteger.nextInt();
                    System.out.println();
                    if(flag == 0)
                    {
                        System.out.print("Текст: ");
                        Message m = new Message(inString.nextLine());
                        cur.addMessage(m);
                        System.out.println();
                    }
                    else
                        if(flag == 1)
                        {
                            System.out.print("Текст: ");
                            Message m = new Message(inString.nextLine()).asList();
                            cur.addMessage(m);
                            System.out.println();
                        }
                        else
                            if(flag == 2)
                            {
                                System.out.print("E-mail: ");
                                Email e = new Email(inString.nextLine()).usePOP3();
                                System.out.println();
                                if(o.sendNoteByEmail(cur, e))
                                {
                                    System.out.println("Sending succesfully! Press ENTER to continue...");
                                    inString.nextLine();
                                }
                                else
                                {
                                    System.out.println("Sending error...Press ENTER to continue...");
                                    inString.nextLine();
                                }
                            }
                }
                while(flag != 3);
            }
            else
                if(choose == 5)
                {
                    System.out.print("Заголовок: ");
                    Note n = new Note(inString.nextLine());
                    o.addNote(n);
                    System.out.println();
                }
        }
        while(choose != 6);
    }
    
}
