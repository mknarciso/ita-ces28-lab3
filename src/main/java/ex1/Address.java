package ex1;

public abstract class Address {
    protected String main_;
    
    public String toPrint(){
        return main_;
    }
    
    abstract Address generateAddress(String main);
}