package ex1;

public class PortugueseFactory extends IdiomFactory {
	Person person_;
	Date data_;
	Address address_;
	
	Person createPerson(String name, String email, String phone) {
		return new PortuguesePerson(name, email, phone);
	}
	
	Date createDate(int day, int month, int year) {
		return new PortugueseDate(day,month,year);
	}
	
	Address createAddress(String address) {
		return new PortugueseAddress(address);
	}

}
