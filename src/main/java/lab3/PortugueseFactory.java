package lab3;

public class PortugueseFactory extends IdiomFactory {
	Person person_;
	Date data_;
	Address address_;
	
	Person createPerson(String name, String email, String phone) {
		return new Person(name, email, phone, "Sr");
	}
	
	Date createDate(int day, int month, int year) {
		return new Date(day + "/" + month + "/" + year);
	}
	
	Address createAddress(String address) {
		return new Address("Rua " + address);
	}

}
