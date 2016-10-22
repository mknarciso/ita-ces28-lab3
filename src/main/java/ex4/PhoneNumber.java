package ex4;

public abstract class PhoneNumber implements Cloneable{
	String phone_ = new String();
	protected String inputPhone_;
	
	public String getPhone() {
		return phone_;
	}
	
	public abstract PhoneNumber generatePhone(String phone);
	
	public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

}
