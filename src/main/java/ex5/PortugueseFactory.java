package ex5;

public class PortugueseFactory extends IdiomFactory {
	
	PortugueseFactory() {
		personPrototype_ = new PortuguesePerson();
		datePrototype_ = new PortugueseDate();
		addressPrototype_ = new PortugueseAddress();
		
	}
	
	LetterBuilder createLetter(String type) {
		if (type.equals("ComercialLetter"))
			return new ComercialLetterPortuguese();
		else if (type.equals("LoveLetter"))
			return new LoveLetterPortuguese();
		else if (type.equals("WeddingInviteLetter"))
			return new WeddingInviteLetterPortuguese();
		return null;
	}
	

}
