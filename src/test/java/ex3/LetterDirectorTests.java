package ex3;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class LetterDirectorTests {
	
    String content = "Here goes all the content of the letter. It doesn`t matter the language its written.";

    @Test
    public void ComercialLetterWithIdiom(){
        String comercialResultUS = "10/15/2016\n\nFrom: \n  Jo�o\n  Street H9C 402\nTo: \n  Marcos\n  Street H8A 112\n\nDear Mr Marcos,\n" + 
        content + "\n\nSincerely,\n\n\n __________________\n Jo�o\n 3333-1222\n email:" + "joao@gmail.com";
	    String comercialResultUSPT = "15/10/2016\n\nFrom: \n  Jo�o\n  Rua H9C 402\nTo: \n  Marcos\n  Rua H8A 112\n\nDear Sr Marcos,\n" + 
  	    content + "\n\nSincerely,\n\n\n __________________\n Jo�o\n 3333-1222\n email:" + "joao@gmail.com";
		
	    
	    LetterDirector director = new LetterDirector("ComercialLetter","english");
		director.addSender("Jo�o","joao@gmail.com","3333-1222","H9C 402");
		director.addReceiver("Marcos","marcos@gmail.com","9999-1222","H8A 112");
		director.addContent(content);
		director.setDate(15,10,2016);
		//System.out.println(director.printLetter());
		assertEquals(comercialResultUS,director.printLetter());
		
		LetterDirector diretor = new LetterDirector("ComercialLetter","portuguese");
		diretor.addSender("Jo�o","joao@gmail.com","3333-1222","H9C 402");
		diretor.addReceiver("Marcos","marcos@gmail.com","9999-1222","H8A 112");
		diretor.addContent(content);
		diretor.setDate(15,10,2016);
		//System.out.println(diretor.printLetter());
		assertEquals(comercialResultUSPT,diretor.printLetter());
    }
    @Test
    public void LoveLetterWithIdiom(){
        String loveResult = "S�o Jos� dos Campos, 10/15/2016\n\nDear Mr Marcos,\n" + content + "\n\nWith love,\n" + 
        	    "\n           Jo�o";
	    String loveResultPT = "S�o Jos� dos Campos, 15/10/2016\n\nDear Sr Marcos,\n" + content + "\n\nWith love,\n" + 
        	    "\n           Jo�o";
		
	    
	    LetterDirector director = new LetterDirector("LoveLetter","english");
		director.addSender("Jo�o","joao@gmail.com","3333-1222","");
		director.addReceiver("Marcos","marcos@gmail.com","9999-1222","");
		director.addCity("S�o Jos� dos Campos");
		director.addContent(content);
		director.setDate(15,10,2016);
		//System.out.println(director.printLetter());
		assertEquals(loveResult,director.printLetter());
		
		LetterDirector diretor = new LetterDirector("LoveLetter","portuguese");
		diretor.addSender("Jo�o","joao@gmail.com","3333-1222","");
		diretor.addReceiver("Marcos","marcos@gmail.com","9999-1222","");
		diretor.addCity("S�o Jos� dos Campos");
		diretor.addContent(content);
		diretor.setDate(15,10,2016);
		//System.out.println(diretor.printLetter());
		assertEquals(loveResultPT,diretor.printLetter());
    }
    @Test
    public void WeddingInviteLetterWithIdiom(){
        String inviteResult = "To:\n  Mr Jo�o\n  Street H8A 112\n\nWe are honored to invite you to the wedding of our sons\n"
        	    + "  Maria & Paulo\n\n The cerimony will be at \nStreet H9C 402 on 10/15/2016\n\n"
        	    + "Please confirm your presence:9999-0000\n\n __________________\n Jo�o, Marta, Marcos and Joana.";
	    String inviteResultPT = "To:\n  Sr Jo�o\n  Rua H8A 112\n\nWe are honored to invite you to the wedding of our sons\n"
	    	    + "  Maria & Paulo\n\n The cerimony will be at \nRua H9C 402 on 15/10/2016\n\n"
	    	    + "Please confirm your presence:9999-0000\n\n __________________\n Jo�o, Marta, Marcos and Joana.";
	
 
	    LetterDirector director = new LetterDirector("WeddingInviteLetter","english");
		director.addSender("Maria","maria@mail.com","9999-0000","H9C 402");
		director.addRelatives("Paulo","Jo�o","Marta","Marcos","Joana");
		director.addReceiver("Jo�o","joao@gmail.com","3333-1222","H8A 112");
		director.setDate(15,10,2016);
		//System.out.println(director.printLetter());
		assertEquals(inviteResult,director.printLetter());
		
		LetterDirector diretor = new LetterDirector("WeddingInviteLetter","portuguese");
		diretor.addSender("Maria","maria@mail.com","9999-0000","H9C 402");
		diretor.addRelatives("Paulo","Jo�o","Marta","Marcos","Joana");
		diretor.addReceiver("Jo�o","joao@gmail.com","3333-1222","H8A 112");
		diretor.setDate(15,10,2016);
		//System.out.println(diretor.printLetter());
		assertEquals(inviteResultPT,diretor.printLetter());
    }
}