package ex1;

import static org.junit.Assert.*;

import org.junit.Test;

public class FactoryTests {
	
	
	@Test
    public void createEnglishPerson(){
		IdiomFactory idiomFactory = FactoryMaker.getFactory("english");
		
		Person personEnglish = idiomFactory.createPerson("Smith", "smith@ita.br", "99999-9999");
		
		assertEquals(personEnglish.treatment(), "Mr");
		
		assertEquals(personEnglish.email(), "smith@ita.br");
		
		assertEquals(personEnglish.phone(), "99999-9999");
		
		assertEquals (personEnglish.name(), "Smith");
		
		
        
    }
	
	@Test
    public void createPortuguesePerson(){
		IdiomFactory idiomFactory = FactoryMaker.getFactory("portuguese");
		
		Person personPortuguese = idiomFactory.createPerson("Smith", "smith@ita.br", "99999-9999");
		
		assertEquals(personPortuguese.treatment(), "Sr");
		
		assertEquals(personPortuguese.email(), "smith@ita.br");
		
		assertEquals(personPortuguese.phone(), "99999-9999");
		
		assertEquals (personPortuguese.name(), "Smith");
		
		
        
    }

}
