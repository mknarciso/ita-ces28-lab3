package ex4;

public class EnglishPerson extends Person {

	
	public EnglishPerson() {
		phoneNumberPrototype_ = new EnglishPhoneNumber();
	}
	public Person generatePerson(String name, String email, String phone) {
		name_ = "Mr " + name;
		email_ = email;
		try {
			phoneNumber_ = (PhoneNumber) phoneNumberPrototype_.generatePhone(phone).clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this;
	}
	
	@Override
	public String name() {
		return name_; 
	}
	

}
