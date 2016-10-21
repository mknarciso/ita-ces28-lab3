package ex4;

public abstract class Person implements Cloneable {
    protected String name_, email_;
    protected PhoneNumber phoneNumber_, phoneNumberPrototype_;
 
    
    public String name(){
        return name_;
    }
    public String email(){
        return email_;
    }
    public String phone(){
        return phoneNumber_.getPhone();
    }
    
    abstract Person generatePerson(String name, String email, String phone);
    
    public void setPhoneConfiguration(PhoneNumber phone) {
    	String stringPhone = phoneNumber_.inputPhone_;
		phoneNumberPrototype_ = phone;		
		try {
			phoneNumber_ = (PhoneNumber) phoneNumberPrototype_.generatePhone(stringPhone).clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
    
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

}
