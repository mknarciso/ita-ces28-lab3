package ex1;

import static org.junit.Assert.*;
import org.junit.*;


public class LetterTest {
    
    Person p1 = new Person("João","joao@gmail.com","3333-1222");
    Person p2 = new Person("Marcos","marcos@gmail.com","9999-1222");
    Person p3 = new Person("Paulo","paulo@gmail.com","9999-1222");
    Person f1 = new Person("Marta","marta@mail.com","9999-8888");
    Person f2 = new Person("Joana","joana@mail.com","9999-0000");
    Person f3 = new Person("Maria","maria@mail.com","9999-0000");
    Date date = new Date(15, 10, 2016);
    Address senderAddr = new Address("H9C 402");
    Address receiverAddr = new Address("H8A 112");
    String content = "Here goes all the content of the letter. It doesn`t matter the language its written.";
    String result1 = 
    "15/10/2016\n\n" +
    "From: \n  João\n  H9C 402\n" + 
    "To: \n  Marcos\n  H8A 112\n\n" + 
    "Dear Marcos,\n" + 
    content + "\n" +
    "\nSincerely,\n" +
    "\n\n __________________\n" +
    " João\n" + 
    " 3333-1222\n"+
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
