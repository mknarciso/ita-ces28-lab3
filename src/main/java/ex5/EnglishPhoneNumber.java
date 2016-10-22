package ex5;

public class EnglishPhoneNumber extends PhoneNumber {
	EnglishPhoneNumber() {
		
	}

	@Override
	public PhoneNumber generatePhone(String phone) {
		
		String newPhone = new String();
		if (phone.length() > 0)
			newPhone = phone.substring(0, 3) + "-" + phone.substring(3, phone.length());		
		phone_ = newPhone;
		return this;
	}

}
