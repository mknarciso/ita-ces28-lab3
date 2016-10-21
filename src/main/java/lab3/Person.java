package lab3;

public abstract class Person {
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
		phoneNumber_ = phoneNumberPrototype_.generatePhone(stringPhone);
	}

}
