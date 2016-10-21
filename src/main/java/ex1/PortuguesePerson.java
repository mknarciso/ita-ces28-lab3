package ex1;

public class PortuguesePerson extends Person {

	private PhoneNumber phoneNumber_;
	
	public PortuguesePerson(String name, String email, String phone) {
		super(name, email, phone);
		phoneNumber_ = new MainPortuguesePhone(phone);
	}
	
	@Override 
	public String name() {
		return "Sr " + name_;
	}

}
