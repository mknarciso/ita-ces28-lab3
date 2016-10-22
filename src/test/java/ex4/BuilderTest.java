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
	IdiomFactory idiomFactory = FactoryMaker.getFactory("portuguese");
    Person p1 = idiomFactory.createPerson("João","joao@gmail.com","12933331222");
    Person p2 = idiomFactory.createPerson("Marcos","marcos@gmail.com","1299991222");
    Person p3 = idiomFactory.createPerson("Paulo","paulo@gmail.com","1299991222");
    Person f1 = idiomFactory.createPerson("Marta","marta@mail.com","1299998888");
    Person f2 = idiomFactory.createPerson("Joana","joana@mail.com","12999990000");
    Person f3 = idiomFactory.createPerson("Maria","maria@mail.com","12999990000");
    Date date = idiomFactory.createDate(15, 10, 2016);   
    Address senderAddr = idiomFactory.createAddress("H9C 402");
    Address receiverAddr = idiomFactory.createAddress("H8A 112");
    String city = "São José dos Campos";
    String content = "Here goes all the content of the letter. It doesn`t matter the language its written.";
    String comercialResult = "15/10/2016\n\nFrom: \n  Sr João\n  Rua H9C 402\nTo: \n  Sr Marcos\n  Rua H8A 112\n\nDear Sr Marcos,\n" + 
    content + "\n\nSincerely,\n\n\n __________________\n Sr João\n (12) 93333-1222\n email:" + "joao@gmail.com";
    String loveResult = "São José dos Campos, 15/10/2016\n\nDear Sr Marcos,\n" + content + "\n\nWith love,\n" + 
    "\n           Sr João";
    String inviteResult = "To:\n  Sr João\n  Rua H8A 112\n\nWe are honored to invite you to the wedding of our sons\n"
    + "  Sr Maria & Sr Paulo\n\n The cerimony will be at \nRua H9C 402 on 15/10/2016\n\n"
    + "Please confirm your presence:(12) 99999-0000\n\n __________________\n Sr João, Sr Marta, Sr Marcos and Sr Joana.";
    
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
        System.out.println(p1.name());
        //System.out.println(love.model());
        assertEquals(loveResult,love.model());
        
    }
    @Test
    public void checkInviteLetter(){
        WeddingInviteLetter invite = new WeddingInviteLetter
        		(p1, f1, p2, f2, p1 ,f3 , p3, date, senderAddr, receiverAddr);
        assertEquals(inviteResult,invite.model());
        //System.out.println(invite.model());
    }    
    
    
}
