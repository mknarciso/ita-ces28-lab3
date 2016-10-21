package lab3.copy;

import static org.junit.Assert.*;

import org.junit.Test;

import lab3.Address;
import lab3.Date;
import lab3.FactoryMaker;
import lab3.IdiomFactory;
import lab3.Person;

public class FactoryTests {
	IdiomFactory idiomFactory_;
	
	@Test
    public void createEnglishPerson(){
		idiomFactory_ = FactoryMaker.getFactory("english");		
		Person personEnglish = idiomFactory_.createPerson("Smith", "smith@ita.br", "99999-9999");
		assertEquals(personEnglish.treatment(), "Mr");		
		assertEquals(personEnglish.email(), "smith@ita.br");		
		assertEquals(personEnglish.phone(), "99999-9999");		
		assertEquals (personEnglish.name(), "Smith");        
    }
	
	@Test
    public void createPortuguesePerson(){
		idiomFactory_ = FactoryMaker.getFactory("portuguese");		
		Person personPortuguese = idiomFactory_.createPerson("Smith", "smith@ita.br", "99999-9999");		
		assertEquals(personPortuguese.treatment(), "Sr");		
		assertEquals(personPortuguese.email(), "smith@ita.br");		
		assertEquals(personPortuguese.phone(), "99999-9999");		
		assertEquals (personPortuguese.name(), "Smith");
        
    }
	
	@Test
	public void createEnglishDate() {
		idiomFactory_ = FactoryMaker.getFactory("english");		
		Date englishDate = idiomFactory_.createDate(17, 9, 1996);		
		assertEquals(englishDate.toPrint(), "9/17/1996");			
	}
	
	@Test
	public void createPortugueseDate() {
		idiomFactory_ = FactoryMaker.getFactory("portuguese");		
		Date portugueseDate = idiomFactory_.createDate(17, 9, 1996);		
		assertEquals(portugueseDate.toPrint(), "17/9/1996");	
		
	}
	
	@Test
	public void createEnglishAddress() {
		idiomFactory_ = FactoryMaker.getFactory("english");
		Address englishAddress = idiomFactory_.createAddress("H8 A");
		assertEquals(englishAddress.toPrint(), "Street H8 A");
		
	}
	
	public void createPortugueseAddress() {
		idiomFactory_ = FactoryMaker.getFactory("portuguese");
		Address portugueseAddress = idiomFactory_.createAddress("H8 A");
		assertEquals(portugueseAddress.toPrint(), "Rua H8 A");
		
	}
	

	

}
