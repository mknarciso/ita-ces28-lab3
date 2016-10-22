package ex5;

public class NewPortuguesePhone extends PhoneNumber {
	NewPortuguesePhone() {
		
		
	}
	
	public PhoneNumber generatePhone(String phone) {
		inputPhone_ = phone;
		String newPhone = new String();
		if (phone.length() > 0)
			newPhone = "DDD: " + phone.substring(0, 2) + " Tel: " + phone.substring(2, 7) + "." 
				+ phone.substring(7, phone.length());
		
		phone_ = newPhone;	
		return this;
	}

	

}
