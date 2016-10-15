package ex1;

public class Person {
    protected String name, email, phone;
    public Person (String name, String email, String phone){
        this.name = name;
        this.email = email;
        this.phone = phone;
    }
    public String name(){
        return name;
    }
    public String email(){
        return email;
    }
    public String phone(){
        return phone;
    }
}
