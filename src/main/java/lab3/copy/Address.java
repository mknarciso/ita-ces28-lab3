package lab3.copy;

public class Address {
    protected String main_;
    public Address (String main){
        main_ = main;
    }
    public String toPrint(){
        return main_;
    }
}
