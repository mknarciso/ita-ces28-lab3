package lab3;

public class PortuguesePerson extends Person {

	
	public PortuguesePerson() {	
		phoneNumberPrototype_ = new MainPortuguesePhone();
		 
	}
	
	@Override 
	public String name() {
		return name_;
	}
	
	@Override
	Person generatePerson(String name, String email, String phone) {
		name_ = "Sr " + name;
		email_ = email;
		phoneNumber_ = phoneNumberPrototype_.generatePhone(phone);
		return this;
	}

}
