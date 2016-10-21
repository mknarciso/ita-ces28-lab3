package ex4;

public class EnglishFactory extends IdiomFactory {
	
	EnglishFactory() {
		personPrototype_ = new EnglishPerson();
		datePrototype_ = new EnglishDate();
		addressPrototype_ = new EnglishAddress();
	}
	

	
	

}
