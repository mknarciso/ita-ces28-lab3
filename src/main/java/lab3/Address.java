package lab3;

public class Address {
    protected String main_;
    public Address (String main){
        main_ = main;
    }
    public String toPrint(){
        return main_;
    }
}