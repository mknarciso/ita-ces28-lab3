package ex1;

public abstract class IdiomFactory {
	Person personPrototype_;
	
	Date datePrototype_;
	
	Address addressPrototype_;
	
	Person createPerson(String name, String email, String phone) {
		return personPrototype_.generatePerson(name, email, phone);
	}
	
	Date createDate(int day, int month, int year) {
		return datePrototype_.generateDate(day, month, year);
	}
	
	Address createAddress(String address) {
		return addressPrototype_.generateAddress(address);
	}

	void setPersonConfiguration(Person person) {
		personPrototype_ =  person;
		
	}

	void setPhoneConfiguration(PhoneNumber phone) {
		personPrototype_.setPhoneConfiguration(phone);
	}

	void setDateConfiguration(Date date) {
		datePrototype_ = date;
		
	}

	void setAddressConfiguration(Address address) {
		addressPrototype_ = address;
	}
	

}
