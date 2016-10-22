package ex5;

public class EnglishFactory extends IdiomFactory {
	
	EnglishFactory() {
		personPrototype_ = new EnglishPerson();
		datePrototype_ = new EnglishDate();
		addressPrototype_ = new EnglishAddress();
	}
	

	LetterBuilder createLetter(String type) {
		if (type.equals("ComercialLetter"))
			return new ComercialLetterEnglish();
		else if (type.equals("LoveLetter"))
			return new LoveLetterEnglish();
		else if (type.equals("WeddingInviteLetter"))
			return new WeddingInviteLetterEnglish();
		return null;
	}
	
	

}
