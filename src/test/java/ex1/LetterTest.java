package ex1;

import static org.junit.Assert.*;
import org.junit.*;


public class LetterTest {
    Person pFactory = new PortuguesePerson();
    Person p1 = pFactory.generatePerson("João","joao@gmail.com","1233331222");
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
    String content = "Here goes all the content of the letter. It doesn`t matter the language its written.";
    String result1 = 
    "15/10/2016\n\n" +
    "From: \n  João\n  Rua H9C 402\n" + 
    "To: \n  Marcos\n  Rua H8A 112\n\n" + 
    "Dear Marcos,\n" + 
    content + "\n" +
    "\nSincerely,\n" +
    "\n\n __________________\n" +
    " João\n" + 
    " (12) 3333-1222\n"+
    " email:" + "joao@gmail.com";
    String city = "São José dos Campos";
    String loveResult = "São José dos Campos, 15/10/2016\n\n" +
    "Dear Marcos,\n" + content + "\n" + 
    "\nWith love,\n" + 
    "\n           João";
    @Test
    public void checkComercialLetter(){
        ComercialLetter comercial = new ComercialLetter(p1, p2,
                                                        senderAddr, receiverAddr, content, date);
        assertEquals(result1,comercial.model());
        System.out.println(comercial.model());
    }
    @Test
    public void checkLoveLetter(){
        LoveLetter love = new LoveLetter(p1, p2, city, content, date);
        assertEquals(loveResult,love.model());
        System.out.println(love.model());
    }
    @Test
    public void checkInviteLetter(){
        WeddingInviteLetter invite = new WeddingInviteLetter(p1, f1, p2, f2,
            p1 ,f3 , p3, date, senderAddr, receiverAddr);
        //assertEquals(loveResult,love.model());
        System.out.println(invite.model());
    }    
    
    
}
