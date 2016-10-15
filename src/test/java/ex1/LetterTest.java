package ex1;

import static org.junit.Assert.*;
import org.junit.*;


public class LetterTest {
    
    Person sender = new Person("João","joao@gmail.com","3333-1222");
    Person receiver = new Person("Marcos","marcos@gmail.com","9999-1222");
    Date date = new Date(15,10,2016);
    Address senderAddr = new Address("H9C 402");
    Address receiverAddr = new Address("H8A 112");
    String result1 = "15/10/2016" + "\n\n" + "João" + "\n" +
    "H9C 402" + "\n" + "Marcos" +
    "H8A 112" + "\n" + "Dear " + "Marcos" + "\n" + "\nSincerely,\n" + "\n\n __________________\n" +
    "João" + "\n " + "3333-1222" +
    "\n email:" + "joao@gmail.com";
    @Test
    public void checkComercialLetter(){
        ComercialLetter comercial = new ComercialLetter(sender, receiver,
                                                        senderAddr, receiverAddr, date);
        assertEquals(result1,comercial.model());
    }
}
