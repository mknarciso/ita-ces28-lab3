package lab3.copy;

public class FactoryMaker {
	
	private static IdiomFactory idiomFactory_ = null;
	
	static IdiomFactory getFactory (String idiom) {
		if (idiom.equals("english"))
			idiomFactory_ = new EnglishFactory();
		else if (idiom.equals("portuguese"))
			idiomFactory_ = new PortugueseFactory();
		
		return idiomFactory_;
	}
	

}
