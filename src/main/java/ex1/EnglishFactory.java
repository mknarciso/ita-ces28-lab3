package ex1;

public class EnglishFactory extends IdiomFactory {
	Person person_;
	Date data_;
	Address address_;
	
	Person createPerson(String name, String email, String phone) {
		return new EnglishPerson(name, email, phone);
	}
	
	Date createDate(int day, int month, int year) {
		return new EnglishDate(day, month, year);
	}
	
	Address createAddress(String address) {
		return new EnglishAddress(address);
	}
	
	

}
