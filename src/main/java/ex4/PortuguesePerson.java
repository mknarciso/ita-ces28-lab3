package ex4;

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
		try {
			phoneNumber_ = (PhoneNumber) phoneNumberPrototype_.generatePhone(phone).clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this;
	}

}
