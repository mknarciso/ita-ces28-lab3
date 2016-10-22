package ex5;


public class LetterDirector {
	private IdiomFactory idiomFactory_;
	private LetterBuilder letter;
	public LetterDirector(String type, String idiom) {
		idiomFactory_ = FactoryMaker.getFactory(idiom);	
        letter = idiomFactory_.createLetter(type);
		
	}
	
	public LetterDirector(String type, String idiomLetter, String idiomSubParts) {
		idiomFactory_ = FactoryMaker.getFactory(idiomLetter);
		letter = idiomFactory_.createLetter(type);
		idiomFactory_ = FactoryMaker.getFactory(idiomSubParts);
	}
	public void addSender(String name, String email, String phone, String addr) {
		letter.addSender(
				idiomFactory_.createPerson(name,email,phone), 
				idiomFactory_.createAddress(addr)
				);
	}

	public void addReceiver(String name, String email, String phone, String addr) {
		letter.addReceiver(
				idiomFactory_.createPerson(name,email,phone), 
				idiomFactory_.createAddress(addr)
				);
	}

	public void addContent(String content) {
		letter.addContent(content);	
	}

	public void setDate(int d, int m, int y) {
		letter.setDate(idiomFactory_.createDate(d, m, y));
	}

	public String printLetter() {
		return letter.model();
	}
	public void addCity(String city) {
		letter.addCity(city);	
	}
	public void addRelatives(String groomName, String brideFatherName, String brideMotherName, String groomFatherName, String groomMotherName) {
		letter.addRelatives(
				idiomFactory_.createPerson(groomName,"",""),
				idiomFactory_.createPerson(brideFatherName,"",""),
				idiomFactory_.createPerson(brideMotherName,"",""),
				idiomFactory_.createPerson(groomFatherName,"",""),
				idiomFactory_.createPerson(groomMotherName,"","")
				);
		
	}
	
	public void setSubPartIdiom(String idiom) {
		idiomFactory_ = FactoryMaker.getFactory(idiom);
	}
	
	public void setPersonConfiguration(Person person) {
		idiomFactory_.setPersonConfiguration(person);
	}
	
	public void setAddressConfiguration(Address address) {
		idiomFactory_.setAddressConfiguration(address);
	}
	public void setPhoneConfiguration(PhoneNumber phoneNumber) {
		idiomFactory_.setPhoneConfiguration(phoneNumber);
	}
	public void setDateConfiguration(Date date) {
		idiomFactory_.setDateConfiguration(date);
	}


}
