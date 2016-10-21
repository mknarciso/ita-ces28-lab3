package ex1;

public class NewPortuguesePhone extends PhoneNumber {
	NewPortuguesePhone(String phone) {
		String newPhone = new String();
		newPhone = "DDD: " + phone.substring(0, 2) + " Tel: " + phone.substring(2, 7) + "." 
				+ phone.substring(7, phone.length());
		
		phone_ = newPhone;		
	}

	

}
