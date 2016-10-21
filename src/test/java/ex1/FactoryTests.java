package ex1;

import static org.junit.Assert.*;

import org.junit.Test;

public class FactoryTests {
	IdiomFactory idiomFactory_;
	
	@Test
    public void createEnglishPerson(){
		idiomFactory_ = FactoryMaker.getFactory("english");		
		Person personEnglish = idiomFactory_.createPerson("Smith", "smith@ita.br", "99999-9999");	
		assertEquals(personEnglish.email(), "smith@ita.br");		
		assertEquals(personEnglish.phone(), "99999-9999");		
		assertEquals (personEnglish.name(), "Mr Smith");        
    }
	
	@Test
    public void createPortuguesePerson(){
		idiomFactory_ = FactoryMaker.getFactory("portuguese");		
		Person personPortuguese = idiomFactory_.createPerson("Smith", "smith@ita.br", "99999-9999");				
		assertEquals(personPortuguese.email(), "smith@ita.br");		
		assertEquals(personPortuguese.phone(), "99999-9999");		
		assertEquals (personPortuguese.name(), "Sr Smith");
        
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
