package lab3;

public class PortugueseFactory extends IdiomFactory {
	
	PortugueseFactory() {
		personPrototype_ = new PortuguesePerson();
		datePrototype_ = new PortugueseDate();
		addressPrototype_ = new PortugueseAddress();
		
	}
	

}
