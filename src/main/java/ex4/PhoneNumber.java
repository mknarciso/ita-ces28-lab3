package ex4;

public abstract class PhoneNumber {
	String phone_ = new String();
	protected String inputPhone_;
	
	public String getPhone() {
		return phone_;
	}
	
	public abstract PhoneNumber generatePhone(String phone);
	

}
