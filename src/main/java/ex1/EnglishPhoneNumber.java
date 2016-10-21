package ex1;

public class EnglishPhoneNumber extends PhoneNumber {
	EnglishPhoneNumber(String phone) {
		String newPhone = new String();
		newPhone = phone.substring(0, 3) + "-" + phone.substring(3, phone.length());		
		phone_ = newPhone;
	}

}
