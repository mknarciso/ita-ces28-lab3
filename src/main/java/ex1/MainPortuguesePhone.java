package ex1;

public class MainPortuguesePhone extends PhoneNumber {
	
	MainPortuguesePhone() {
		
	}
	
	public PhoneNumber generatePhone(String phone) {
		inputPhone_ = phone;
		String newPhone = new String();
		newPhone = "(" + phone.substring(0, 2)+ ")" + " " + phone.substring(2, 7) + "-" +
					phone.substring(7, phone.length());		
		phone_ = newPhone;
		return this;
	}

}
