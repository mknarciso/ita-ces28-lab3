package lab3;

public class EnglishDoctorPerson extends Person {


	public EnglishDoctorPerson() {
		 phoneNumberPrototype_ = new EnglishPhoneNumber();
	}
	public Person generatePerson(String name, String email, String phone) {
		name_ = "Dr " + name;
		email_ = email + " and " + name + "@university.edu";
		phoneNumber_ = phoneNumberPrototype_.generatePhone(phone);
		return this;
	}
	
	@Override
	public String name() {
		return name_; 
	}
	

}
