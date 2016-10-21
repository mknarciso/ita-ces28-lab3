package ex1;

public class Person {
    protected String name_, email_;
    PhoneNumber phoneNumber_;
    public Person (String name, String email, String phone){
        name_ = name;
        email_ = email;
        phoneNumber_ = new EnglishPhoneNumber(phone);
    }
    public String name(){
        return name_;
    }
    public String email(){
        return email_;
    }
    public String phone(){
        return phoneNumber_.getPhone();
    }
}
