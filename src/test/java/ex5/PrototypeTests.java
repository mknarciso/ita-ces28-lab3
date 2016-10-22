package ex5;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class PrototypeTests {

	IdiomFactory idiomFactory_;
	@Test
	public void testDynamicPhones() {
		//Pode-se modificar o phone de uma person j� existente
		idiomFactory_ = FactoryMaker.getFactory("portuguese");
				
		Person personPortuguese = idiomFactory_.createPerson("Smith", "smith@ita.br", "12999999999");					
		assertEquals(personPortuguese.phone(), "(12) 99999-9999");	
		
		personPortuguese.setPhoneConfiguration(new NewPortuguesePhone());
		assertEquals(personPortuguese.phone(), "DDD: 12 Tel: 99999.9999");
		
	}
	
	@Test
	public void testDynamicPhoneInFactory() {
		//Pode-se modificar o phone da f�brica, para que novas persons produzidas
		//tenham o novo formato
		idiomFactory_ = FactoryMaker.getFactory("portuguese");
		
		Person personPortuguese = idiomFactory_.createPerson("Smith", "smith@ita.br", "12999999999");					
		assertEquals(personPortuguese.phone(), "(12) 99999-9999");
		
		idiomFactory_.setPhoneConfiguration(new NewPortuguesePhone());
		
		Person newPersonPortuguese = idiomFactory_.createPerson("Smith", "smith@ita.br", "12999999999");
		assertEquals(newPersonPortuguese.phone(), "DDD: 12 Tel: 99999.9999");
		
	}
	
	@Test
	public void testDynamicPersonInFactory() {
		//Podem existir v�rias formas de Person em ingl�s
		idiomFactory_ = FactoryMaker.getFactory("english");
		Person personEnglish = idiomFactory_.createPerson("Smith", "smith@gmail.com.br", "5551234");
		assertEquals(personEnglish.name(), "Mr Smith");
		assertEquals(personEnglish.email(), "smith@gmail.com.br");
		
		idiomFactory_.setPersonConfiguration(new EnglishDoctorPerson());
		Person newPersonEnglish = idiomFactory_.createPerson("Smith", "smith@gmail.com.br", "5551234");
		assertEquals(newPersonEnglish.name(), "Dr Smith");
		assertEquals(newPersonEnglish.email(), "smith@gmail.com.br and Smith@university.edu");
		//Ap�s a mudan�a na f�brica, entretanto, personEnglish permanece o mesmo
		assertEquals(personEnglish.name(), "Mr Smith");
		assertEquals(personEnglish.email(), "smith@gmail.com.br");
	}

}
