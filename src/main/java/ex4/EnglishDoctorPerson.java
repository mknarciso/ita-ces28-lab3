package ex4;

public class EnglishDoctorPerson extends Person {


	public EnglishDoctorPerson() {
		 phoneNumberPrototype_ = new EnglishPhoneNumber();
	}
	public Person generatePerson(String name, String email, String phone) {
		name_ = "Dr " + name;
		email_ = email + " and " + name + "@university.edu";
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
