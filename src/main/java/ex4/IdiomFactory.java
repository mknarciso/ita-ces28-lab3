package ex4;


public abstract class IdiomFactory {
	Person personPrototype_;
	
	Date datePrototype_;
	
	Address addressPrototype_;
	
	Person createPerson(String name, String email, String phone) {
		try {
			return (Person) personPrototype_.generatePerson(name, email, phone).clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return null;
	}

	Date createDate(int day, int month, int year) {
		try {
			return (Date) datePrototype_.generateDate(day, month, year).clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	Address createAddress(String address) {
		try {
			return (Address) addressPrototype_.generateAddress(address).clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
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
	Person updatePerson(Person person){
		return createPerson(person.name(),person.email(),person.phone());
	}
}
