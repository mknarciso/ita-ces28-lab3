package ex3;

public class LetterDirector {
	private IdiomFactory idiomFactory_;
	private ComercialLetter letter;
	public LetterDirector(String type, String idiom) {
		idiomFactory_ = FactoryMaker.getFactory(idiom);	
		letter = new ComercialLetter();
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


}
