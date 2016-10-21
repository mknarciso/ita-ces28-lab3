package lab3;

import static org.junit.Assert.*;
import org.junit.*;

import lab3.Address;
import lab3.ComercialLetter;
import lab3.Date;
import lab3.LoveLetter;
import lab3.Person;
import lab3.WeddingInviteLetter;


public class BuilderTest {
    Person p1 = new Person("João","joao@gmail.com","3333-1222", "Mr. ");
    Person p2 = new Person("Marcos","marcos@gmail.com","9999-1222", "Mr. ");
    Person p3 = new Person("Paulo","paulo@gmail.com","9999-1222", "Mr. ");
    Person f1 = new Person("Marta","marta@mail.com","9999-8888", "Mrs. ");
    Person f2 = new Person("Joana","joana@mail.com","9999-0000", "Mrs. ");
    Person f3 = new Person("Maria","maria@mail.com","9999-0000", "Ms. ");
    Date date = new Date("15/10/2016");
    Address senderAddr = new Address("H9C 402");
    Address receiverAddr = new Address("H8A 112");
    String city = "São José dos Campos";
    String content = "Here goes all the content of the letter. It doesn`t matter the language its written.";
    String comercialResult = "15/10/2016\n\nFrom: \n  João\n  H9C 402\nTo: \n  Marcos\n  H8A 112\n\nDear Marcos,\n" + 
    content + "\n\nSincerely,\n\n\n __________________\n João\n 3333-1222\n email:" + "joao@gmail.com";
    String loveResult = "São José dos Campos, 15/10/2016\n\nDear Marcos,\n" + content + "\n\nWith love,\n" + 
    "\n           João";
    String inviteResult = "To:\n  João\n  H8A 112\n\nWe are honored to invite you to the wedding of our sons\n"
    + "  Maria & Paulo\n\n The cerimony will be at \nH9C 402 on 15/10/2016\n\n"
    + "Please confirm your presence:9999-0000\n\n __________________\n João, Marta, Marcos and Joana.";
    
    @Test
    public void checkComercialLetter(){
        ComercialLetter comercial = new ComercialLetter(p1, p2,
                                                        senderAddr, receiverAddr, content, date);
        assertEquals(comercialResult,comercial.model());
        //System.out.println(comercial.model());
    }
    @Test
    public void checkLoveLetter(){
        LoveLetter love = new LoveLetter(p1, p2, city, content, date);
        assertEquals(loveResult,love.model());
        //System.out.println(love.model());
    }
    @Test
    public void checkInviteLetter(){
        WeddingInviteLetter invite = new WeddingInviteLetter
        		(p1, f1, p2, f2, p1 ,f3 , p3, date, senderAddr, receiverAddr);
        assertEquals(inviteResult,invite.model());
        //System.out.println(invite.model());
    }    
    
    
}
