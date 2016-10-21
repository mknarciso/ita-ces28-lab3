package lab3;

public class EnglishFactory extends IdiomFactory {
	Person person_;
	Date data_;
	Address address_;
	
	Person createPerson(String name, String email, String phone) {
		return new Person(name, email, phone, "Mr");
	}
	
	Date createDate(int day, int month, int year) {
		return new Date(month + "/" + day + "/" + year);
	}
	
	Address createAddress(String address) {
		return new Address("Street " + address);
	}
	
	

}
