package ex3;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MergeTests {
	
    String content = "Here goes all the content of the letter. It doesn`t matter the language its written.";
    String comercialResultUS = "10/15/2016\n\nFrom: \n  João\n  Street H9C 402\nTo: \n  Marcos\n  Street H8A 112\n\nDear Mr Marcos,\n" + 
    content + "\n\nSincerely,\n\n\n __________________\n João\n 3333-1222\n email:" + "joao@gmail.com";

    @Test
    public void letterWithIdiom(){
		LetterDirector director = new LetterDirector("ComercialLetter","english");
		director.addSender("João","joao@gmail.com","3333-1222","H9C 402");
		director.addReceiver("Marcos","marcos@gmail.com","9999-1222","H8A 112");
		director.addContent(content);
		director.setDate(15,10,2016);
		System.out.println(director.printLetter());
		assertEquals(comercialResultUS,director.printLetter());
    }
}