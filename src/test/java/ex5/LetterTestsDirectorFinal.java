package ex5;

import static org.junit.Assert.*;

import org.junit.Test;



public class LetterTestsDirectorFinal {

	String content = "Here goes all the content of the letter. It doesn`t matter the language its written.";
	//Testes do exercicio 5: Testou-se com um tipo espec�fico de carta (comercial), mas o mesmo tamb�m
	//vale para todos os tipos de carta.
	@Test
	public void testComercialLetterFullEnglish() {
		//Carta comercial em ingles com subpartes em ingles
		String comercialResultUS = "10/15/2016\n\nFrom: \n  Mr Jo�o\n  Street H9C 402\nTo: \n  Mr Marcos\n  Street H8A 112\n\nDear Mr Marcos,\n" + 
		        content + "\n\nSincerely,\n\n\n __________________\n Mr Jo�o\n 555-1222\n email:" + "joao@gmail.com";
			    
		LetterDirector director = new LetterDirector("ComercialLetter","english");
		director.addSender("Jo�o","joao@gmail.com","5551222","H9C 402");
		director.addReceiver("Marcos","marcos@gmail.com","5551222","H8A 112");
		director.addContent(content);
		director.setDate(15,10,2016);
		assertEquals(comercialResultUS,director.printLetter());
		
	}
	
	@Test
	public void testComercialLetterEnglishSubPartsPortuguese() {
		//Carta comercial em ingles com subpartes em portugues
		String comercialResultUS = "15/10/2016\n\nFrom: \n  Sr Jo�o\n  Rua H9C 402\nTo: \n  Sr Marcos\n  Rua H8A 112\n\nDear Sr Marcos,\n" + 
		        content + "\n\nSincerely,\n\n\n __________________\n Sr Jo�o\n (12) 95551-2222\n email:" + "joao@gmail.com";
			    
		LetterDirector director = new LetterDirector("ComercialLetter","english", "portuguese");
		director.addSender("Jo�o","joao@gmail.com","12955512222","H9C 402");
		director.addReceiver("Marcos","marcos@gmail.com","12955512222","H8A 112");
		director.addContent(content);
		director.setDate(15,10,2016);
		assertEquals(comercialResultUS,director.printLetter());
		
	}
	
	@Test
	public void testComercialLetterEnglishSubpartsMixed() {
		//Carta comercial em ingles e subpartes com idiomas diferentes
		String comercialResultUS = "15/10/2016\n\nFrom: \n  Mr Jo�o\n  Street H9C 402\nTo: \n  Sr Marcos\n  Rua H8A 112\n\nDear Sr Marcos,\n" + 
		        content + "\n\nSincerely,\n\n\n __________________\n Mr Jo�o\n 555-1222\n email:" + "joao@gmail.com";
			    
		LetterDirector director = new LetterDirector("ComercialLetter", "english");
		director.addSender("Jo�o","joao@gmail.com","5551222","H9C 402");
		director.setSubPartIdiom("portuguese");
		director.addReceiver("Marcos","marcos@gmail.com","12955512222","H8A 112");
		director.addContent(content);
		director.setDate(15,10,2016);
		assertEquals(comercialResultUS,director.printLetter());
		
		
	}
	
	@Test
	public void testComercialLetterPortugueseSubpartesMixedDynamics() {
		//Carta comercial em portugu�s, subpartes din�micas (exemplo 4) e de v�rios idiomas
		String comercialResultUSPT = "10/15/2016\n\nDe: \n  Sr Jo�o\n  Rua H9C 402\nPara: \n  Dr Marcos\n  Street H8A 112\n\nQuerido Dr Marcos,\n" + 
		  	    content + "\n\nAtenciosamente,\n\n\n __________________\n Sr Jo�o\n DDD: 12 Tel: 93333.1222\n email:" + "joao@gmail.com";
		
		LetterDirector diretor = new LetterDirector("ComercialLetter","portuguese");
		diretor.setPhoneConfiguration(new NewPortuguesePhone());
		//Esta caracterista do phone eh mantida na PortugueseFactory, pois FactoryMaker
		//possui uma lista estatica de IdiomFactories.
		diretor.addSender("Jo�o","joao@gmail.com", 	"12933331222","H9C 402");
		diretor.setSubPartIdiom("english");
		diretor.setPersonConfiguration(new EnglishDoctorPerson());
		diretor.setPhoneConfiguration(new EnglishPhoneNumber());
		diretor.addReceiver("Marcos","marcos@gmail.com","9999-1222","H8A 112");
		diretor.addContent(content);
		diretor.setDate(15,10,2016);
		assertEquals(comercialResultUSPT,diretor.printLetter());
		
	}


}
