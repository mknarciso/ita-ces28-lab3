package ex1;

public class EnglishPerson extends Person {

	public EnglishPerson(String name, String email, String phone) {
		super(name, email, phone);
	}
	
	@Override
	public String name() {
		return "Mr " + name_; 
	}

}
