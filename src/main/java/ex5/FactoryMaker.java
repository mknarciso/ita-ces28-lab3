package ex5;

import java.util.HashMap;

public class FactoryMaker {
	
	static HashMap<String, IdiomFactory> idiomFactoryList_ = new HashMap<String,IdiomFactory>();
	private static IdiomFactory idiomFactory_ = null;
	
	static IdiomFactory getFactory (String idiom) {
		if (idiomFactoryList_.containsKey(idiom))
			idiomFactory_ = idiomFactoryList_.get(idiom);
		else {
			if (idiom.equals("english"))
				idiomFactory_ = new EnglishFactory();
			else if (idiom.equals("portuguese"))
				idiomFactory_ = new PortugueseFactory();
			
			idiomFactoryList_.put(idiom, idiomFactory_);
		}
		
		
		return idiomFactory_;
	}
	

}
