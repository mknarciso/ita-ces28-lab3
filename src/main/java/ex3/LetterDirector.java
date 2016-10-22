package ex3;

public class LetterDirector {
	private IdiomFactory idiomFactory_;
	private LetterBuilder letter;
	public LetterDirector(String type, String idiom) {
		idiomFactory_ = FactoryMaker.getFactory(idiom);	
        if(type=="ComercialLetter"){
        	letter = new ComercialLetter();
        } else if(type=="LoveLetter"){
        	letter = new LoveLetter();
        } else if(type=="WeddingInviteLetter"){
        	letter = new WeddingInviteLetter();
        }else{
        	System.out.println("Tipo de Carta inválida!");
        }
		
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


}
