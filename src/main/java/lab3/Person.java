package lab3;

public class Person {
    protected String name_, email_, phone_, treatment_;
    public Person (String name, String email, String phone, String treatment ){
        name_ = name;
        email_ = email;
        phone_ = phone;
        treatment_ = treatment;
    }
    public String name(){
        return name_;
    }
    public String email(){
        return email_;
    }
    public String phone(){
        return phone_;
    }
    
    public String treatment() {
    	return treatment_;
    }
}
