package ex4;

import static org.junit.Assert.*;
import org.junit.*;

import ex4.Address;
import ex4.ComercialLetter;
import ex4.Date;
import ex4.LoveLetter;
import ex4.Person;
import ex4.PortugueseAddress;
import ex4.PortugueseDate;
import ex4.PortuguesePerson;
import ex4.WeddingInviteLetter;


public class BuilderTest {
	Person pFactory = new PortuguesePerson();
    Person p1 = pFactory.generatePerson("JoÃ£o","joao@gmail.com","1233331222");
    Person p2 = pFactory.generatePerson("Marcos","marcos@gmail.com","1299991222");
    Person p3 = pFactory.generatePerson("Paulo","paulo@gmail.com","1299991222");
    Person f1 = pFactory.generatePerson("Marta","marta@mail.com","1299998888");
    Person f2 = pFactory.generatePerson("Joana","joana@mail.com","1299990000");
    Person f3 = pFactory.generatePerson("Maria","maria@mail.com","1299990000");
    Date dFactory = new PortugueseDate();
    Date date = dFactory.generateDate(15, 10, 2016);
    Address addressFactory = new PortugueseAddress();
    Address senderAddr = addressFactory.generateAddress("H9C 402");
    Address receiverAddr = addressFactory.generateAddress("H8A 112");
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
