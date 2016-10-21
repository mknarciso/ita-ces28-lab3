package lab3;

public class EnglishPerson extends Person {

	
	public EnglishPerson() {
		phoneNumberPrototype_ = new EnglishPhoneNumber();
	}
	public Person generatePerson(String name, String email, String phone) {
		name_ = "Mr " + name;
		email_ = email;
		phoneNumber_ = phoneNumberPrototype_.generatePhone(phone);
		return this;
	}
	
	@Override
	public String name() {
		return name_; 
	}
	

}
