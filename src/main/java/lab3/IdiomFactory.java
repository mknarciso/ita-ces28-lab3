package lab3;

public abstract class IdiomFactory {
	abstract Person createPerson(String name, String email, String phone);
	
	abstract Date createDate(int month, int day, int year);
	
	abstract Address createAddress(String address);
	
	Person updatePerson(Person person){
		return createPerson(person.name(),person.email(),person.phone());
	}
}
